package com.snail.service.impl;

import com.google.common.collect.Maps;
import com.snail.common.enums.AppLoginEnum;
import com.snail.common.enums.AppLoginStatus;
import com.snail.dao.EmployeeMapper;
import com.snail.dao.UserLoginLogMapper;
import com.snail.dao.UserLoginMapper;
import com.snail.pojo.domain.EmployeeExample;
import com.snail.pojo.domain.UserLoginExample;
import com.snail.pojo.domain.UserLoginLog;
import com.snail.pojo.form.UserForm;
import com.snail.service.base.ILoginService;
import com.snail.util.JedisClientUtil;
import com.snail.util.MD5Util;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import redis.clients.jedis.Jedis;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午3:22 2017/10/29
 * @Description:
 */
@Service
@Slf4j
public class LoginServiceImpl implements ILoginService {

    /** 登录过期时间, 默认为30分钟,单位为秒 */
    private static final Integer userExpiredTime = 30 * 60;

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private UserLoginLogMapper userLoginLogMapper;

    @Override
    public Map<String, Object> login(UserForm form, String ip) {
        String loginName = form.getLoginName();
        String password = form.getPassword();
        password = MD5Util.MD5EncodeUtf8(password);

        List users = listUsers(form.getLoginName(), password, form.getApp());

        Map<String, Object> result = Maps.newHashMap();
        //用户名密码错误
        if (CollectionUtils.isEmpty(users)) {
            result.put("code", AppLoginStatus.FAILED.getCode());
            result.put("message", AppLoginStatus.FAILED.getDesc());
            return result;
        }

        //已经登录
        if(checkUserLogin(loginName, form.getApp())) {
            result.put("code", AppLoginStatus.FORBIDDEN.getCode());
            result.put("message", AppLoginStatus.FORBIDDEN.getDesc());
            return result;
        }

        //保存用户信息到缓存
        String token = UUID.randomUUID().toString();
        Jedis jedis = JedisClientUtil.getJedis();
        jedis.setex(token, userExpiredTime, loginName);
        jedis.setex(loginName + ":" + form.getApp(), userExpiredTime, token);
        JedisClientUtil.closeJedis(jedis);

        //保存用户登录信息
        insertUserLoginLog(form.getApp(), ip, token, loginName);

        result.put("xToken", token);
        result.put("loginName", form.getLoginName());
        result.put("code", AppLoginStatus.SUCCESS.getCode());
        return result;
    }

    @Override
    public void logout(String xToken, String app) {
        Jedis jedis = JedisClientUtil.getJedis();
        String loginName = jedis.get(xToken);
        jedis.del(xToken);
        jedis.del(loginName);
        JedisClientUtil.closeJedis(jedis);
    }

    @Override
    public Boolean checkUserLogin(String loginName, String app) {
        Jedis jedis = JedisClientUtil.getJedis();
        String redisLoginName = jedis.get(loginName + ":" + app);
        JedisClientUtil.closeJedis(jedis);
        if (redisLoginName != null) {
            return true;
        }
        return false;
    }

    /**
     * 保存用户登录信息
     *
     * @param app
     * @param ip
     * @param xToken
     * @param loginName
     */
    private void insertUserLoginLog(String app, String ip, String xToken, String loginName) {
        UserLoginLog record = new UserLoginLog();
        record.setLoginIp(ip);
        record.setToken(xToken);
        record.setLoginTime(new Date());
        record.setLoginType(app);
        record.setLoginName(loginName);
        record.setLoginResult(AppLoginStatus.SUCCESS.toString());
        userLoginLogMapper.insertSelective(record);
    }

    /**
     * 根据用户名和密码验证用户
     *
     * @param loginName
     * @param password
     * @param app
     * @return
     */
    private List listUsers(String loginName, String password, String app) {
        List users;
        if (AppLoginEnum.SNAIL_ADMIN.toString().equals(app)) {
            EmployeeExample example = new EmployeeExample();
            example.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password);
            users = employeeMapper.selectByExample(example);
        } else {
            UserLoginExample example = new UserLoginExample();
            example.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password);
            users = userLoginMapper.selectByExample(example);
        }
        return users;
    }

}

package com.snail.service.impl;

import com.google.common.collect.Maps;
import com.snail.common.enums.AppLoginEnum;
import com.snail.common.enums.AppLoginStatus;
import com.snail.dao.UserLoginLogMapper;
import com.snail.dao.UserLoginMapper;
import com.snail.pojo.domain.UserLogin;
import com.snail.pojo.domain.UserLoginExample;
import com.snail.pojo.domain.UserLoginLog;
import com.snail.service.base.AbstractLoginService;
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
 * Web登录登出入口
 *
 * Created by panyuanyuan 2017/10/5
 */
@Service
@Slf4j
public class WebLoginServiceImpl extends AbstractLoginService {

    /** 登录过期时间, 默认为30分钟,单位为秒 */
    private static final Integer userExpiredTime = 30 * 60;

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Autowired
    private UserLoginLogMapper userLoginLogMapper;

    @Override
    public Map<String, Object> login(String loginName, String password, String ip) {
        password = MD5Util.MD5EncodeUtf8(password);
        UserLoginExample example = new UserLoginExample();
        example.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password);
        List<UserLogin> users = userLoginMapper.selectByExample(example);

        Map<String, Object> result = Maps.newHashMap();
        if (CollectionUtils.isEmpty(users)) {
            result.put("code", AppLoginStatus.FAILED.getCode());
            result.put("message", AppLoginStatus.FAILED.getDesc());
            return result;
        }

        //保存用户信息到缓存
        String token = UUID.randomUUID().toString();
        Jedis jedis = JedisClientUtil.getJedis();
        jedis.setex(AppLoginEnum.WEB.toString() + ":" + loginName, userExpiredTime, token);
        JedisClientUtil.closeJedis(jedis);

        //保存登录记录
        UserLogin user = users.get(0);
        UserLoginLog record = new UserLoginLog();
        record.setLoginIp(ip);
        record.setToken(token);
        record.setLoginTime(new Date());
        record.setLoginId(user.getLoginId());
        record.setLoginType(AppLoginEnum.WEB.toString());
        record.setLoginResult(AppLoginStatus.SUCCESS.toString());
        userLoginLogMapper.insertSelective(record);

        result.put("token", token);
        result.put("loginName", user.getLoginName());
        result.put("code", AppLoginStatus.SUCCESS.getCode());
        return result;
    }
}

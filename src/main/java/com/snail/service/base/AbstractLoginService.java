package com.snail.service.base;

import com.snail.util.JedisClientUtil;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import redis.clients.jedis.Jedis;

/**
 * 用户登录适配器类
 *
 * Created by panyuanyuan 2017/10/6
 */
public abstract class AbstractLoginService implements ILoginService{

    @Override
    public Map<String, Object> login(String loginName, String password, String ip) {
        return null;
    }

    @Override
    public void logout(String loginName, String app) {
        Jedis jedis = JedisClientUtil.getJedis();
        jedis.del(app + ":" + loginName);
        JedisClientUtil.closeJedis(jedis);
    }

    @Override
    public Boolean checkUserLogin(String loginName, String token, String app) {
        Boolean result = false;
        Jedis jedis = JedisClientUtil.getJedis();
        String redisToken = jedis.get(app + ":" + loginName);
        JedisClientUtil.closeJedis(jedis);
        if (StringUtils.equals(token, redisToken)) {
            return true;
        }
        return result;
    }
}

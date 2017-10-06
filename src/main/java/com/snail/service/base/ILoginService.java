package com.snail.service.base;

import com.sun.istack.internal.NotNull;
import java.util.Map;
import lombok.NonNull;

/**
 * 登录,登出相关的接口
 *
 * Created by panyuanyuan 2017/10/5
 */
public interface ILoginService {

    /**
     * 用户登录
     *
     * @param loginName
     * @param password
     */
    Map<String, Object> login(@NonNull String loginName, @NotNull String password, String ip);

    /**
     * 用户登出: 只需要登录名,和app类型
     */
    void logout(String loginName, String app);

    /**
     * 验证用户是否登录
     *
     * @param loginName
     * @param token
     * @return
     */
    Boolean checkUserLogin(@NotNull String loginName, @NotNull String token, String app);
}

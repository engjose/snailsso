package com.snail.pojo.vo;

/**
 * 用户登录返回Vo
 */
public class UserLoginVo {

    private String token;

    private String loginName;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}

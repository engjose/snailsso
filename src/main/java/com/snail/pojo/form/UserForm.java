package com.snail.pojo.form;

import lombok.NonNull;

/**
 * User Form
 *
 * Created by panyuanyuan 2017/10/5
 */
public class UserForm {

    /** 用户登录昵称 */
    @NonNull
    private String loginName;

    /** 用户登录密码 */
    @NonNull
    private String password;

    /** 用户操作application */
    private String app;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
}

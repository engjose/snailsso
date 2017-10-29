package com.snail.common.enums;

/**
 * 不同application登录,注册枚举
 *
 * Created by panyuanyuan on 2017/10/6.
 */
public enum AppLoginEnum {

    SNAIL_WEB("WEB", "官网登录"),
    SNAIL_ADMIN("SNAIL_ADMIN", "管理平台登录");

    /** 应用类型 */
    private String app;

    /** 实现类 */
    private String desc;

    AppLoginEnum(String app, String desc) {
        this.app = app;
        this.desc = desc;
    }

    public String getApp() {
        return app;
    }

    public String getImplClass() {
        return desc;
    }
}

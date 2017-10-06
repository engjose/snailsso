package com.snail.commen.enums;

/**
 * 不同application登录,注册枚举
 *
 * Created by panyuanyuan on 2017/10/6.
 */
public enum AppLoginEnum {

    QQ("QQ", "qqLoginService"),
    WEI_XIN("WEI_XIN", "weiXinLoginService"),
    WEB("WEB", "webLoginService");

    /** 应用类型 */
    private String app;

    /** 实现类 */
    private String implClass;

    AppLoginEnum(String app, String implClass) {
        this.app = app;
        this.implClass = implClass;
    }

    public String getApp() {
        return app;
    }

    public String getImplClass() {
        return implClass;
    }
}

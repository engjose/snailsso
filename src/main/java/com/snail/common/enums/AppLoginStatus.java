package com.snail.common.enums;

/**
 * 登录状态
 */
public enum AppLoginStatus {

    SUCCESS("SUCCESS", "登录成功", 200),
    FAILED("FAILED", "用户名或密码错误!", 500),
    FORBIDDEN("FORBIDDEN", "用户已经登录", 403);

    private String status;
    private String desc;
    private Integer code;

    AppLoginStatus(String status, String desc, Integer code) {
        this.status = status;
        this.desc = desc;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

package com.snail.common.constants;

/**
 * Created by panyuanyuan on 2017/6/13.
 */
public enum  ResponseCode {

    /** 成功的响应码 */
    SUCCESS(200, "成功"),

    /** 请求失败响应码 */
    ERROR(500, "发生错误"),

    /** 需要登录响应码 */
    NEED_LOGIN(403, "无权限"),

    /** 参数异常响应码 */
    ILLEGAL_ARGUMENT(405, "参数有误");

    private final Integer code;
    private final String description;

    ResponseCode(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode () {
        return code;
    }

    public String getDescription() {
        return description;
    }
}

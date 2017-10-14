package com.snail.common.enums;

/**
 * 员工级别枚举
 *
 * Created by Panyuanyuan on 2017/10/13.
 */
public enum EmployeeLevel {

    ADMIN(1, "普通员工"),NORMAL(2, "管理员");

    /** 级别Code */
    private Integer code;

    /** 描述 */
    private String desc;

    EmployeeLevel(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}

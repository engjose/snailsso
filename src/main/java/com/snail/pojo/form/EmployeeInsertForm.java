package com.snail.pojo.form;

import lombok.*;

import java.util.Date;

/**
 *  @description 用户添加form
 *
 *  @author Jiankun.Zhangsun 2017年10月15日12:55:02
 */

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeInsertForm {
    /** 员工ID */
    private Integer employeeId;

    /** 登录名 */
    @NonNull
    private String loginName;

    /** 密码 */
    @NonNull
    private String password;

    /** 员工姓名 */
    @NonNull
    private String name;

    /** 员工级别 */
    @NonNull
    private Integer level;

    /** 职位 */
    @NonNull
    private String position;

    /** 头像URL */
    private String iconUrl;

    /** 生活照URL */
    private String lifePicUrl;

    /** 介绍 */
    private String introduction;

    /** 座右铭 */
    private String motto;

    /** 手机号码 */
    private String mobile;

    /** 邮箱 */
    private String email;

    /** 性别 */
    private String gender;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 员工状态 0:离职， 1:在职 */
    private Integer status;
}
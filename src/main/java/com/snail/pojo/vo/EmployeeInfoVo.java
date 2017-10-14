package com.snail.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 员工简要信息Vo
 *
 * Created by Panyuanyuan on 2017/10/13.
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeInfoVo {

    /** 员工Id */
    private Integer employeeId;

    /** 登录昵称 */
    private String loginName;

    /** 真实姓名 */
    private String name;

    /** 级别 */
    private String level;

    /** 职位 */
    private String position;

    /** 手机号 */
    private String mobile;

    /** 性别 */
    private String gender;

}

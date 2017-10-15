package com.snail.service.base;

import com.snail.pojo.form.EmployeeForm;
import com.snail.pojo.vo.EmployeeInfoVo;

import java.util.List;
import java.util.Map;

/**
 *  @description 用户管理模块业务层接口
 *  Create By Jiankun.Zhangsun 2017年10月14日15:57:57
 */
public interface IUserManagerService {

    /**
     * 查询用户列表
     * @return 用户列表
     */
    Map<String, Object> listEmployees(EmployeeForm form);
}

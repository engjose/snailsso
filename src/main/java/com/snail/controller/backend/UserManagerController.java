package com.snail.controller.backend;

import com.snail.common.constants.ResultMap;
import com.snail.pojo.form.EmployeeForm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理,包括员工管理Controller
 *
 * Created by Panyuanyuan on 2017/10/13.
 */
@RestController
@RequestMapping(value = "/employee")
public class UserManagerController {

    /**
     * 查询员工列表
     *
     * @param form
     * @return
     */
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public ResultMap getEmployees(EmployeeForm form) {
        return null;
    }


}

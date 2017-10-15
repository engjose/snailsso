package com.snail.controller.backend;

import com.snail.pojo.form.EmployeeForm;
import com.snail.service.base.IUserManagerService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class UserManageController {

    @Autowired
    private IUserManagerService iUserManagerService;
    /**
     * 查询员工列表
     *
     * @param form 查询条件
     * @return 返回结果
     */
    @CrossOrigin
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public Map<String, Object> getEmployees(EmployeeForm form) {
        return iUserManagerService.listEmployees(form);
    }

    /**
     * TODO 员工详情查询
     */


}

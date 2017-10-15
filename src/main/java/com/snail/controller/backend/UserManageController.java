package com.snail.controller.backend;

import com.snail.common.constants.ResponseCode;
import com.snail.common.constants.ResultMap;
import com.snail.pojo.domain.Employee;
import com.snail.pojo.form.EmployeeInsertForm;
import com.snail.pojo.form.EmployeeQueryForm;
import com.snail.service.base.IUserManagerService;
import java.util.Map;

import com.snail.util.FTPUtil;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    @GetMapping(value = "/employees")
    public Map<String, Object> getEmployees(EmployeeQueryForm form) {
        return iUserManagerService.listEmployees(form);
    }

    /**
     * 根据用户ID查询用户详情
     *
     * @param id 用户ID
     * @return 响应结果
     */
    @CrossOrigin
    @GetMapping(value = "/employees/{id}")
    public ResultMap getEmployeeDetails(@PathVariable Integer id) {
        Employee employee = iUserManagerService.getEmployeeById(id);
        return ResultMap.getResultMap(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDescription(), employee);
    }

    /**
     * 添加用户
     *
     * @param form 用户信息
     * @return 响应结果
     */
    @CrossOrigin
    @PostMapping("/employees")
    public ResultMap insert(EmployeeInsertForm form) {
        iUserManagerService.insertEmployee(form);
        return ResultMap.getResultMap(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDescription());
    }

    /**
     * ftp服务器文件上传
     *
     * @return 文件所在ftp服务器的URL
     */
    @CrossOrigin
    @PostMapping("/employees/uploadImg")
    public ResultMap uploadImg(MultipartFile file) {


       // FTPUtil.uploadFile(file);
        return null;
    }
}

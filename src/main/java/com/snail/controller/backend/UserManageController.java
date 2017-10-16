package com.snail.controller.backend;

import com.snail.common.constants.ResponseCode;
import com.snail.common.constants.ResultMap;
import com.snail.pojo.domain.Employee;
import com.snail.pojo.form.EmployeeInsertForm;
import com.snail.pojo.form.EmployeeQueryForm;
import com.snail.service.base.IFileService;
import com.snail.service.base.IUserManagerService;
import com.snail.service.impl.UserManageServiceImpl;
import java.util.Map;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户管理,包括员工管理Controller
 *
 * Created by Panyuanyuan on 2017/10/13.
 */
@RestController
@RequestMapping(value = "/employee")
@CrossOrigin
public class UserManageController {

    @Autowired
    private UserManageServiceImpl userManageService; //线上bug ,先剔除接口

    @Autowired
    private IFileService iFileUploadService;

    /**
     * 查询员工列表
     *
     * @param form 查询条件
     * @return 返回结果
     */
    @GetMapping(value = "/employees")
    public Map<String, Object> getEmployees(EmployeeQueryForm form) {
        return userManageService.listEmployees(form);
    }

    /**
     * 根据用户ID查询用户详情
     *
     * @param id 用户ID
     * @return 响应结果
     */
    @GetMapping(value = "/employees/{id}")
    public ResultMap getEmployeeDetails(@PathVariable Integer id) {
        Employee employee = userManageService.getEmployeeById(id);
        return ResultMap.getResultMap(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDescription(), employee);
    }

    /**
     * 添加用户
     *
     * @param form 用户信息
     * @return 响应结果
     */
    @PostMapping("/employees")
    public ResultMap insert(@RequestBody EmployeeInsertForm form) {
        userManageService.insertEmployee(form);
        return ResultMap.getResultMap(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDescription());
    }

    /**
     * ftp服务器文件上传
     *
     * @return 文件所在ftp服务器的URL
     */
    @PostMapping("/uploadImg")
    public ResultMap uploadImg(@NonNull MultipartFile file, HttpServletRequest request) {
        String path = request.getServletContext().getRealPath("/upload");
        String url = iFileUploadService.uploadFile(file, path);
        return ResultMap.getResultMap(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDescription(), url);
    }
}

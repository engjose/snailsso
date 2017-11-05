package com.snail.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.snail.dao.EmployeeMapper;
import com.snail.dao.UserMapper;
import com.snail.pojo.domain.Employee;
import com.snail.pojo.domain.EmployeeExample;
import com.snail.pojo.domain.User;
import com.snail.pojo.form.EmployeeInsertForm;
import com.snail.pojo.form.EmployeeQueryForm;
import com.snail.pojo.form.UserForm;
import com.snail.pojo.vo.EmployeeInfoVo;
import com.snail.service.base.ILoginService;
import com.snail.service.base.IUserManagerService;
import com.snail.util.IPUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import com.snail.util.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户管理Service
 *
 * Created by panyuanyuan 2017/10/5
 */
@Service
@Slf4j
public class UserManageServiceImpl implements IUserManagerService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ILoginService iLoginService;

    /**
     * 用户登录
     *
     * @param form
     */
    public Map<String, Object> login(UserForm form, HttpServletRequest request) {
        return iLoginService.login(form, IPUtil.getIpAddr(request));
    }

    /**
     * 检测用户是否登录某个应用
     *
     * @param loginName
     * @param app
     * @return
     */
    public Boolean checkUserLogin(String loginName, String xToken, String app) {
        return iLoginService.checkUserLogin(loginName, xToken);
    }

    /**
     * 用户登出
     *
     * @param xToken
     * @param app
     */
    public void logout(String xToken, String app) {
        iLoginService.logout(xToken, app);
    }

    /**
     * @see com.snail.service.base.IUserManagerService#listEmployees(EmployeeQueryForm)
     * @return 用户列表
     */
    @Override
    public Map<String, Object> listEmployees(EmployeeQueryForm form) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        // 根据用户真实姓名模糊查询
        if (StringUtils.isNotBlank(form.getName())) {
            criteria.andNameLike("%" + form.getName() + "%");
        }
        // 根据手机号码精确查询
        if (StringUtils.isNotBlank(form.getMobile())) {
            criteria.andMobileEqualTo(form.getMobile());
        }
        // 根据用户登录名进行模糊查询
        if (StringUtils.isNotBlank(form.getLoginName())) {
            criteria.andLoginNameLike("%" + form.getLoginName() + "%");
        }
        // 设置分页查询
        PageHelper.startPage(form.getPageNo(), form.getPageSize());
        List<Employee> employeeList = employeeMapper.selectByExample(example);
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(employeeList);

        // 封装数据
        List<Employee> employees = pageInfo.getList();
        List<EmployeeInfoVo> employeeInfoVos = new ArrayList<EmployeeInfoVo>();
        for (Employee employee : employees) {
            EmployeeInfoVo employeeInfoVo = new EmployeeInfoVo();
            BeanUtils.copyProperties(employee,employeeInfoVo);
            employeeInfoVos.add(employeeInfoVo);
        }

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("totals", pageInfo.getTotal());
        resultMap.put("data", employeeInfoVos);
        return resultMap;
    }

    /**
     * @see com.snail.service.base.IUserManagerService#getEmployeeById(Integer)
     * @param id 用户ID
     * @return 用户详情对象
     */
    @Override
    public Employee getEmployeeById(Integer id) {
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        employee.setPassword(null);
        return employee;
    }

    /**
     * @see com.snail.service.base.IUserManagerService#insertEmployee(EmployeeInsertForm)
     * @param form 用户信息
     */
    @Override
    public void insertEmployee(EmployeeInsertForm form) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(form, employee);
        employee.setPassword(MD5Util.MD5EncodeUtf8(form.getPassword()));
        Date date = new Date();
        employee.setUpdateTime(date);
        employee.setCreateTime(date);
        // 1:有效；0:无效
        employee.setStatus(1);
        employeeMapper.insert(employee);
    }

    @Override
    public User getUserInfoById(Integer userId) {
       return userMapper.selectByPrimaryKey(userId);
    }


}

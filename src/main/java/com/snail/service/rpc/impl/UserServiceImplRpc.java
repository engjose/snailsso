package com.snail.service.rpc.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.snail.common.enums.AppLoginEnum;
import com.snail.pojo.domain.Employee;
import com.snail.pojo.domain.User;
import com.snail.service.base.IUserManagerService;
import com.snail.service.rpc.base.IUserServiceRpc;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 上午10:58 2017/11/2
 * @Description:
 */
@Service
public class UserServiceImplRpc implements IUserServiceRpc {

    @Autowired
    private IUserManagerService iUserManagerService;

    @Override
    public Map getUserOrEmployeeInfo(Integer userId, String app) {
        if (AppLoginEnum.SNAIL_ADMIN.toString().equals(app)) {
            Employee employee = iUserManagerService.getEmployeeById(userId);
            return JSON.parseObject(JSONObject.toJSONString(employee), Map.class);
        }

        User user = iUserManagerService.getUserInfoById(userId);
        return JSON.parseObject(JSONObject.toJSONString(user), Map.class);
    }
}

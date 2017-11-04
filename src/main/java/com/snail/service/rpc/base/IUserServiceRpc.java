package com.snail.service.rpc.base;

import java.util.Map;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 上午10:55 2017/11/2
 * @Description:
 */
public interface IUserServiceRpc {

    /**
     * 获取用户或员工基本信息:app是后台管理系统则获取员工信息
     *
     * @param userId
     * @param app
     * @return
     */
    Map getUserOrEmployeeInfo(Integer userId, String app);
}

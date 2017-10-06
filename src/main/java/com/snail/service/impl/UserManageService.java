package com.snail.service.impl;

import com.snail.commen.enums.AppLoginEnum;
import com.snail.pojo.form.UserForm;
import com.snail.service.base.ILoginService;
import com.snail.util.IPUtil;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * 用户管理Service
 *
 * Created by panyuanyuan 2017/10/5
 */
@Service
@Slf4j
public class UserManageService {

    /**
     * 用户登录
     *
     * @param form
     */
    public Map<String, Object> login(UserForm form, HttpServletRequest request) {
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ILoginService loginService = (ILoginService) webApplicationContext.getBean(AppLoginEnum.valueOf(form.getApp()).getImplClass());
        return loginService.login(form.getLoginName(), form.getPassword(), IPUtil.getIpAddr(request));
    }

    /**
     * 检测用户是否登录某个应用
     *
     * @param loginName
     * @param token
     * @param app
     * @return
     */
    public Boolean checkUserLogin(String loginName, String token, String app) {
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ILoginService loginService = (ILoginService) webApplicationContext.getBean(AppLoginEnum.valueOf(app).getImplClass());
        return loginService.checkUserLogin(loginName, token, app);
    }

    /**
     * 用户退出登录
     *
     * @param loginName
     * @param app
     */
    public void logout(String loginName, String app) {
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ILoginService loginService = (ILoginService) webApplicationContext.getBean(AppLoginEnum.valueOf(app).getImplClass());
        loginService.logout(loginName, app);
    }
}

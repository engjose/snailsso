package com.snail.controller.portal;

import com.snail.common.constants.ResultMap;
import com.snail.pojo.form.UserForm;
import com.snail.service.impl.UserManageServiceImpl;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 前台用户管理Controller
 *
 * Created by panyuanyuan 2017/10/5
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/snail/web")
public class UserController {

    @Autowired
    private UserManageServiceImpl userManageService;

    /**
     * 用户登录
     *
     * @param form
     * @param request
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map<String, Object> login(@RequestBody UserForm form, HttpServletRequest request) {
        return userManageService.login(form, request);
    }

    /**
     * 检查用户是否登录
     *
     * @param loginName
     * @param token
     * @param app
     * @return
     */
    @RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
    public Boolean checkUserLogin(@NonNull String loginName, @NonNull String token, @NonNull String app) {
        return userManageService.checkUserLogin(loginName, token, app);
    }

    /**
     * 退出登录
     *
     * @param loginName
     * @param app
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public void logout(@NonNull String loginName, @NonNull String app) {
        userManageService.logout(loginName, app);
    }
}

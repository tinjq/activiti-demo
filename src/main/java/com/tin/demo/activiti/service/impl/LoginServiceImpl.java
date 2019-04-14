package com.tin.demo.activiti.service.impl;

import com.tin.demo.activiti.entity.User;
import com.tin.demo.activiti.service.LoginService;
import com.tin.demo.activiti.utils.SystemContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Tin on 2019/04/14.
 */
public class LoginServiceImpl implements LoginService {

    @Override
    public void logon(User user, HttpServletRequest request) {
        request.getSession().setAttribute(SystemContext.SYS_SESSION_USER, user);
    }
}

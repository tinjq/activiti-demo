package com.tin.demo.activiti.service;

import com.tin.demo.activiti.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Tin on 2019/04/14.
 */
public interface LoginService {

    void logon(User user, HttpServletRequest request);
}

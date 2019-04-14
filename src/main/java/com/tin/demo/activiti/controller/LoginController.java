package com.tin.demo.activiti.controller;

import com.tin.demo.activiti.entity.User;
import com.tin.demo.activiti.service.LoginService;
import com.tin.demo.activiti.service.UserService;
import com.tin.demo.activiti.utils.CryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Tin on 2019/04/14.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(String username, String password, Model model, HttpServletRequest request) {
        User user = new User();
        user.setUserAccount(username);
        User dbUser = userService.findUser(user);
        if (dbUser == null || !userService.getCrptPassword(password).equals(dbUser.getPassword())) {
            model.addAttribute("loginError", "用户或密码错误");
            return "login";
        }

        loginService.logon(user, request);

        return "redirect:/";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}

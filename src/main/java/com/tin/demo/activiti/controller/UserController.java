package com.tin.demo.activiti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tin.demo.activiti.entity.User;
import com.tin.demo.activiti.service.UserService;

/**
 * Created by Tin on 2019/04/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> list = userService.list();
		model.addAttribute("list", list);
		return "user/list";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "user/add";
	}
	
	@RequestMapping("/save")
	public String save(User user) {
		if (user.getPassword() == null) {
			user.setPassword("123123");
		}
		if (user.getPassword() != null) {
			user.setPassword(userService.getCrptPassword(user.getPassword()));
		}
		userService.save(user);
		return "redirect:/user/list";
	}
	
}

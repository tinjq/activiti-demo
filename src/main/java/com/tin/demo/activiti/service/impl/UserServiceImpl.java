package com.tin.demo.activiti.service.impl;

import java.util.List;

import com.tin.demo.activiti.utils.CryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tin.demo.activiti.entity.User;
import com.tin.demo.activiti.mapper.UserMapper;
import com.tin.demo.activiti.service.UserService;

/**
 * Created by Tin on 2019/04/14.
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void save(User user) {
		userMapper.save(user);
	}

	@Override
	public User findUser(User user) {
		return userMapper.findUser(user);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public void delete(Long id) {
		userMapper.delete(id);
	}

	@Override
	public List<User> list() {
		return userMapper.list();
	}

	@Override
	public String getCrptPassword(String password) {
		return CryptUtil.MD5(password);
	}

}

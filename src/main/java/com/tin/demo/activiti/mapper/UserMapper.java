package com.tin.demo.activiti.mapper;

import java.util.List;

import com.tin.demo.activiti.entity.User;

/**
 * Created by Tin on 2019/04/14.
 */
public interface UserMapper {

    void save(User user);

    User findUser(User user);

    void update(User user);

    void delete(Long id);

	List<User> list();

}

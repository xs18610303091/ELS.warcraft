package com.cn.lt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.lt.dao.UserMapper;
import com.cn.lt.pojo.User;
import com.cn.lt.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper usermap;
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.usermap.selectByPrimaryKey(userId);
	}

}

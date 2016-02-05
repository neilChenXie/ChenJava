package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.userMapper;
import com.model.user;


@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private userMapper userMap;
	
	
	
	public userMapper getUserMap() {
		return userMap;
	}


	@Autowired
	public void setUserMap(userMapper userMap) {
		this.userMap = userMap;
	}

	
	public user getUserById(Integer id) {
			
		return userMap.selectByPrimaryKey(id);
		
	}





}

package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.user;
import com.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:configs/spring.xml","classpath:configs/spring-mybatis.xml"})
public class SpringTest {
	private UserServiceI us;

	public UserServiceI getUs() {
		return us;
	}

	@Autowired
	public void setUs(UserServiceI us) {
		this.us = us;
	}
	
	@Test
	public void test1() {
		user u = us.getUserById(1);
		System.out.println(u.getLastname());
	}
	
}

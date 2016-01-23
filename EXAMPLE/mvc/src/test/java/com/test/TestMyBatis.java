package com.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.user;
import com.service.UserServiceI;


public class TestMyBatis {
	AbstractApplicationContext ac;
	UserServiceI userService;
	
	@Before
	public void Before() {
		ac = new ClassPathXmlApplicationContext(new String[] {"classpath:configs/spring.xml","classpath:configs/spring-mybatis.xml"});
		userService = (UserServiceI) ac.getBean("userService");
	}
	
	@Test
	public void test1() {
		user u = userService.getUserById(1);
		System.out.println(u.getFirstname());
		ac.close();
	}
}

package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.First;
import com.service.FirstServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:configs/spring.xml"})
public class TestMybatis {

	private FirstServiceI firstService;

	/**
	 * @return the firstService
	 */
	public FirstServiceI getFirstService() {
		return firstService;
	}

	/**
	 * @param firstService the firstService to set
	 */
	@Autowired
	public void setFirstService(FirstServiceI firstService) {
		this.firstService = firstService;
	}

	
	@Test
	public void test1() {
		//ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"classpath:configs/spring.xml","classpath:configs/spring-mybatis.xml"});
		//FirstServiceI userService = (FirstServiceI)ac.getBean("firstService");
		First f = firstService.getFirstById(0);
		System.out.println(f);
	}
}

package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.model.user;
import com.service.UserServiceI;

//import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

	private UserServiceI us;
	
	public UserServiceI getUs() {
		return us;
	}

	@Autowired
	public void setUs(UserServiceI us) {
		this.us = us;
	}


	@RequestMapping("/good")
	public String showUser(String id, HttpServletRequest req) {
		System.out.println("arrived");
//		user u = us.getUserById(Integer.parseInt(id));
		user u = us.getUserById(1);
		req.setAttribute("user", u);
		return "hello";
	}

}

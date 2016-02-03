package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.First;
import com.service.FirstServiceI;

@Controller()
@RequestMapping("/firstController")
public class FirstController {

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

	@RequestMapping("/showUser")
	public String showUser(String id, HttpServletRequest req) {
		System.out.println("here");
		First f = firstService.getFirstById(1);
		req.setAttribute("first", f);
		System.out.println(f);
		return "showUser";
	}
}

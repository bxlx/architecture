package com.bxlx.www.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bxlx.www.service.TestService;

@Controller
@RequestMapping(value = "/home")
public class HomeContrller {
	
	@Resource
	private TestService testService;
	
	@RequestMapping(value = "/test")
	public String index() { 
		System.out.println(testService.hello("xiaojiyun"));
		return "index";
	}

	
	
	
}

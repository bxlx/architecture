package com.bxlx.www.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bxlx.www.service.TestService;

/**
 * The Class HomeContrller.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeContrller {
	
	/** The test service. */
	@Resource
	private TestService testService;
	
	/**
	 * Index.
	 *
	 * @return the string
	 */
	@RequestMapping(value = "/test")
	public String index() { 
		System.out.println(testService.hello("xiaojiyun"));
		return "index";
	}

	
	
	
}

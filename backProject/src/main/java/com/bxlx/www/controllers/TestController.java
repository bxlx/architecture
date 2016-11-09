package com.bxlx.www.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * The Class TestController.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	/**
	 * Index.
	 *
	 * @return the string
	 */
	@RequestMapping(value = "/index")
	public String index() { 
		
		return "index";
	}
}

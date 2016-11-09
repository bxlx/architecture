package com.bxlx.www.service.impl;

import org.springframework.stereotype.Service;

import com.bxlx.www.service.TestService;

/**
 * The Class TestServiceImpl.
 */
@Service("testService")
public class TestServiceImpl implements TestService{
	
	/** hello
	 * @see com.bxlx.www.service.TestService#hello(java.lang.String)
	 */
	public String hello(String name) {	
		return "hello"+name;
	}
}

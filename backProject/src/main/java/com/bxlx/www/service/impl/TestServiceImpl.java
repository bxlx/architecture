package com.bxlx.www.service.impl;

import org.springframework.stereotype.Service;

import com.bxlx.www.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService{
	
	public String hello(String name) {	
		return "hello"+name;
	}
}

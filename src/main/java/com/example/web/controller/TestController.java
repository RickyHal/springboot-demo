package com.example.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.api.TestApi;
import com.example.model.Test;

//这里很重要
@Controller
public class TestController {

	@Resource
	private TestApi testApi;

	// 配置请求地址
	@RequestMapping(value = "/test")
	@ResponseBody
	public Test test() {
		System.out.println("hello world");
		Test test = new Test();
		test.setId("1");
		test.setLength(1);
		test.setMsg("hhahahuhaus");
		// 返回字符串ok给前端
		return test;
	}

	// 配置请求地址
	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		return testApi.sayHello();
	}
}

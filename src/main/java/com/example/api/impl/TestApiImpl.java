package com.example.api.impl;

import org.springframework.stereotype.Component;

import com.example.api.TestApi;

@Component
public class TestApiImpl implements TestApi {

	@Override
	public String sayHello() {
		return "how are u??";
	}

}

package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.example.api.impl.TestApiImpl;

public class SpringConfiguration {
	@Bean
	@Scope("prototype")
	public TestApiImpl testApi() {
		return new TestApiImpl();
	}
}

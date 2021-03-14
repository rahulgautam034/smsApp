package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
public class BeanConfiguration {

	@Bean("gson")
	public Gson gson() {
		return new Gson();
	}
}

package com.barath.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class SimplePropertyConfiguration {
	
	@Value("${name:test}")
	private String name;
	
	@Value("${age:0}")
	private int age;
	
	
	@PostConstruct
	public void init(){
		System.out.println("NAME IS "+name);
		System.out.println("AGE IS "+age);
	}

}

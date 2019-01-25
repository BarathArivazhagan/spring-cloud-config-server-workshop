package com.barath.app;

import java.lang.invoke.MethodHandles;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class SimplePropertyConfiguration {
	
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Value("${name:test}")
	private String name;
	
	@Value("${age:0}")
	private int age;
	
	
	@PostConstruct
	public void init(){
		logger.info("NAME ===>  {}",name);
		logger.info("AGE  ===> {}",age);
	}

}

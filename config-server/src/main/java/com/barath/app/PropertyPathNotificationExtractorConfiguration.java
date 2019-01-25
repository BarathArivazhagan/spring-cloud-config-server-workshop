package com.barath.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.config.monitor.BitbucketPropertyPathNotificationExtractor;
import org.springframework.cloud.config.monitor.GithubPropertyPathNotificationExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.invoke.MethodHandles;

@Configuration
public class PropertyPathNotificationExtractorConfiguration {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Profile("github")
	@Bean
	public GithubPropertyPathNotificationExtractor gitHubNotification(){

		logger.info("configuring github profile");
		return new GithubPropertyPathNotificationExtractor();
	}
	
	@Profile("bitbucket")
	@Bean
	public BitbucketPropertyPathNotificationExtractor bitBucketNotification(){
		logger.info("configuring bit bucket profile");
		return new BitbucketPropertyPathNotificationExtractor();
	}

}

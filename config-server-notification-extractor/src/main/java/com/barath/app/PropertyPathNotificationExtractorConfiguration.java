package com.barath.app;

import org.springframework.cloud.config.monitor.BitbucketPropertyPathNotificationExtractor;
import org.springframework.cloud.config.monitor.GithubPropertyPathNotificationExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PropertyPathNotificationExtractorConfiguration {
	
	@Profile("github")
	@Bean
	public GithubPropertyPathNotificationExtractor gitHubNotification(){
		System.out.println("GITHUB ");
		return new GithubPropertyPathNotificationExtractor();
	}
	
	@Profile("bitbucket")
	@Bean
	public BitbucketPropertyPathNotificationExtractor bitBucketNotification(){
		System.out.println("BIT BUCKET ");
		return new BitbucketPropertyPathNotificationExtractor();
	}

}

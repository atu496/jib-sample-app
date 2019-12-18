package com.atu496.jib.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.atu496.blank")
public class AppConfig {

@Bean
public RestTemplate resttemplate() {
	return new RestTemplate();
}
}

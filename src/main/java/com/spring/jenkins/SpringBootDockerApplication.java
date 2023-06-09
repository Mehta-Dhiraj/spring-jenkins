package com.spring.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootDockerApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootDockerApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application Started...");
		logger.info("Application Started second statement...");
		
	}

	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}

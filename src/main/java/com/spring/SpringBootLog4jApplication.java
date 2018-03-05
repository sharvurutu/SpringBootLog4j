package com.spring;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4jApplication {

	private static Logger logger = LogManager.getLogger(SpringBootLog4jApplication.class);
	
	public static void main(String[] args) {
		logger.info("Starting Spring Boot application..");
		logger.debug("This is debug message...");
		logger.error("Error has come.. ALERT !!! ");
		
		SpringApplication.run(SpringBootLog4jApplication.class, args);
	}
}

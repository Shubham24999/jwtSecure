package com.secure.security;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	private static final Logger logger = LogManager.getLogger(SecurityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
		logger.info("Application Started.");
	}

}

package com.shivatube;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkDemoApplication {

	// Initializing instance of Logger for Service
	private static final Logger log = LoggerFactory.getLogger(ElkDemoApplication.class);

	public static void main(String[] args) {

		log.info("Application getting started");
		SpringApplication.run(ElkDemoApplication.class, args);

	}

}

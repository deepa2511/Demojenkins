package com.jenkins.tqpp;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojenkinsApplication {

	public static Logger logger=LoggerFactory.getLogger(DemojenkinsApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application started");
		
	}
	public static void main(String[] args) {
		SpringApplication.run(DemojenkinsApplication.class, args);
		logger.info("hi in main");
	}

}

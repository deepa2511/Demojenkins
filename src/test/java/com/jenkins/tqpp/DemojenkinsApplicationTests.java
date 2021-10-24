package com.jenkins.tqpp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemojenkinsApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(DemojenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		
		logger.info("Test case executing...");
		logger.info("Test case executing second good morning ...");
		logger.info("hiii");
		logger.info("bye bye");
		logger.info("helooooooooooooooooooooooooo");
		logger.info("dgfdgdgfdgfdgfd");
		assertEquals(true, true);
	}

}

package com.spring.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDockerApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootDockerApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executed...");
		assertEquals(true, true);
	}

}

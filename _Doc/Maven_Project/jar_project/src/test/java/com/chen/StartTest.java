package com.chen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartTest {
	
	final Logger logger = LoggerFactory.getLogger(Start.class);
	
	public void test () {
		logger.info("hello world");
	}
	
	public static void main(String[] args) {
		StartTest st = new StartTest();
		st.test();
	}
}

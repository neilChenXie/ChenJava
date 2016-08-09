package com.chen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Start {
	final Logger logger = LoggerFactory.getLogger(Start.class);
	
	public void test () {
		logger.info("hello world");
	}
	
	public static void main(String[] args) {
		Start wm = new Start();
		wm.test();
	}
}

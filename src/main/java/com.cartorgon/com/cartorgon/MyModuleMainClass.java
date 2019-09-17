package com.cartorgon;

import java.util.logging.Logger;

import org.openjdk.jmh.annotations.Benchmark;

public class MyModuleMainClass {
	
	private static final Logger LOGGER = Logger.getLogger(MyModuleMainClass.class.getName());

	@Benchmark
	public static final void main(final String[] args) {
		LOGGER.info("I'm in 'MyModuleMainClass.main'");
	}
}
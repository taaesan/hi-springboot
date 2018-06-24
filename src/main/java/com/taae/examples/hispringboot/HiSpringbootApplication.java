package com.taae.examples.hispringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HiSpringbootApplication extends SpringBootServletInitializer {

	/**
	 * Used when run as a jar
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HiSpringbootApplication.class, args);
	}

	/**
	 * Used when run war
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HiSpringbootApplication.class);
	}


}

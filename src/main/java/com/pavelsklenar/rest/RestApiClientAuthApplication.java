package com.pavelsklenar.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestApiClientAuthApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(RestApiClientAuthApplication.class, args);
	}

}

/*
@SpringBootApplication
public class RestApiClientAuthApplication  {

	public static void main(String[] args) {
		SpringApplication.run(RestApiClientAuthApplication.class, args);
	}
}
*/
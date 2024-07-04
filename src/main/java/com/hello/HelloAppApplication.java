package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloAppApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloAppApplication.class, args);
		System.out.println("Hello World App is running...");
	}

	
}

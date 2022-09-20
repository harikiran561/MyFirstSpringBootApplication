package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("End");
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppWithDb2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppWithDb2Application.class, args);
		System.out.println("app running");
	}

}

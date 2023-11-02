package com.example.demo.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppWithDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppWithDbApplication.class, args);
		System.out.println("app running");
	}

}

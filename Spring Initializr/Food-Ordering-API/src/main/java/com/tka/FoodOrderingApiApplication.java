package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodOrderingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderingApiApplication.class, args);
		System.out.println("Application Started...");
	}

}

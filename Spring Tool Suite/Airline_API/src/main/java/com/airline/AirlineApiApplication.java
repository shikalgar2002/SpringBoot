package com.airline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirlineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineApiApplication.class, args);
		System.out.println("Application is Started...");
	}

}

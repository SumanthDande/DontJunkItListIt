package com.example.DontJunkItListIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.DontjunkItListIt.entity")
public class DontJunkItListItApplication {

	public static void main(String[] args) {
		SpringApplication.run(DontJunkItListItApplication.class, args);
		
		
	}

}

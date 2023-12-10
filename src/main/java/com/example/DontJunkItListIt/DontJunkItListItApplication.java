package com.example.DontJunkItListIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EntityScan(basePackages = "com.example.DontjunkItListIt.entity")
@CrossOrigin(origins = "http://localhost:4200")

public class DontJunkItListItApplication {

	public static void main(String[] args) {
		SpringApplication.run(DontJunkItListItApplication.class, args);
		
		
	}

}

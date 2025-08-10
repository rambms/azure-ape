package com.azure.ape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureApeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureApeApplication.class, args);
	}
	
	@GetMapping("/msg")
	public String home() {
		return "Welcome to Azure Ape!";
	}

}

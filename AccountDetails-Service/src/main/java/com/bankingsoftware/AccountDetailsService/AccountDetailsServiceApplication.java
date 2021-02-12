package com.bankingsoftware.AccountDetailsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountDetailsServiceApplication.class, args);
	}

}

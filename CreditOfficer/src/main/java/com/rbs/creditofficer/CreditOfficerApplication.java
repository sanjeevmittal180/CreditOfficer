package com.rbs.creditofficer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rbs.creditofficer.ui.controllers,com.rbs.creditofficer.shared.service")
@EntityScan("com.rbs.creditofficer.data")
@EnableDiscoveryClient
public class CreditOfficerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditOfficerApplication.class, args);
	}

}

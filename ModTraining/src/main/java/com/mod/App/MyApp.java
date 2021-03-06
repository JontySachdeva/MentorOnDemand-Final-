package com.mod.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.mod.*")
@EntityScan(basePackages = "com.mod.entity")
public class MyApp {

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

}

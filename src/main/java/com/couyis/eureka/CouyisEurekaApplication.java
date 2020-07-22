package com.couyis.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CouyisEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouyisEurekaApplication.class, args);
	}

}

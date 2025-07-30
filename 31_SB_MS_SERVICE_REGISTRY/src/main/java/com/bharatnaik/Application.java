package com.bharatnaik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer 
// we are using this annotation in this application so that this appliation will act as a Eureka server.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

package com.bharatnaik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/*
   The @EnableDiscoveryClient annotation in Spring Cloud is used to enable a Spring Boot application to participate in service discovery. 
   It automatically registers the application with a service discovery server (like Eureka, Consul, or Kubernetes) available on the classpath. 
   This registration allows other services to find and communicate with the application. Essentially, it simplifies the process of making your microservice discoverable within a distributed system. 
 */

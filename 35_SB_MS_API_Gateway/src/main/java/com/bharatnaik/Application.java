package com.bharatnaik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // This application act as a Client of Eureka Server Client.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/*
   Routing => Routing means Navigate the request from one application to another application.
   -> Instead of write the security logic in both the APIs we can write the security logic in API Gateway to verify the request is valid or not.
   -> it is recomended to write the security logic in the API gateway instead of writing in all the apis.
   
   -> Filter : Filters are used to perform preprocessing.
       To create a Filter in the AP I Gateway we are going to implements a concept called GlobalFilter.
       -> Let's create a class called MyFilter and implements GlobalFilter.
       
       
      --> ZIPKIN Server is used for observebility purpose, So how many request are coming to our application how much time is taken by each request
       to process and Which serviceses are involbed in the request processing that can be indentify by using Zipkin server. <-- 
*/
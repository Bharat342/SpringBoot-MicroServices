package com.bharatnaik.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharatnaik.GreetFiegnClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFiegnClient greetClient;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String WelcomeMsg() {
		
		String port = env.getProperty("server.port");
		
		String welcomeMsg = "Welcome Bharat... ( " + port + " )";
		
		String greetMsg = greetClient.invokeGreetApi(); // in the welcome method we are accessing the greet API by using FeignClient.
		
		
		return greetMsg + ", " + welcomeMsg; 
	}
}
// if we are getting the response form both the api then our Inter Servce Communication is success we can say.
// Here we are achieving Inter Service Communication by using FeignClient.

/*
		    Here it is doing InterService call (one service is calling another service using FeignClient) is only called Inter Service Communication.
		
		 NOTE : One Rest API can Communicate in 3 ways 1. TestTemplate, 2. WebClient, 3. FeignClient in the Spring Boot. 
		FeignClient Generally is used in MicroServices if one service/api wants to communicate with the another service/api.
	    if Both APIs are registred with the Service Registry then we can go with FeignClient with the Service name.
		 if both APIs are not registed with the same service registry then we can go with service url or API Url.
 */
package com.bharatnaik.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String greetMsg() {
		
		String portNum = env.getProperty("server.port");
		
		return "Goob Evening Bharat ( " + portNum + " )";
	}
}

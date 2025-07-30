package com.bharatnaik;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//@FeignClient(name="GREET_API") // Here we are giving @FeignClient annotation so that whenever we called the invokeGreetApi() method.
// FeignClient will go to service Registry and it will get the service url based on the service name ("GREET_API")
// for that url it will send a request to "/greet" page then GreetController method will be called.



// Here FeignClient is communicating with service name not with url.
// When we are using FeignClient the implementation will be provided for FeignClient in the runtime by spring cloud.
// we no need to write the logic to access the Rest API. we just tell which API we want to access what is the url pattern of the API.

//NOTE : One Rest API can Communicate in 3 ways 1. TestTemplate, 2. WebClient, 3. FeignClient in the Spring Boot. 
		// FeignClient Generally is used in MicroServices if one service/api wants to communicate with the another service/api.
		// if Both APIs are registred with the Service Registry then we can go with FeignClient with the Service name.
		// if both APIs are not registed with the same service registry then we can go with service url or API Url.

//@FeignClient(url="http://localhost:9091", name="greet") // This aproach also will work  
@FeignClient(name="GREET-API")  // Recomendded Approach
public interface GreetFiegnClient {

	
	@GetMapping("/greet")
	public String invokeGreetApi(); // when we run this method it will call = "GREET-API/Greet"
	
	
//	@PostMapping("/greet/{name}")
//	public String invokeGreetApiPost(@PathVariable String name);
}

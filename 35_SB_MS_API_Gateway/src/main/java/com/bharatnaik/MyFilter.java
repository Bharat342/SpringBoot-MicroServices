package com.bharatnaik;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		// Accessing HTTP Request information
		ServerHttpRequest request = exchange.getRequest();
		
		// accessing what are the headers coming in the request. 
		HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		
		for(String key : keySet) {
			List<String> values = headers.get(key);
			
			System.out.println(key + "::" + values);
		}
		
		// we can check for token in header if the token is present then only process the request otherwise don't process the request.
		
		return chain.filter(exchange);
	}
	
}

/*
 *  -> GlobalFilter interface is having a filter() method 
 *  -> By using "exchange" we can access the request 
   
 *  -> API Gateway is used to manage all the backend API present in our application.
 *  -> API Gateway contains Filter and Routing 
 *     Filter are used to perform pre processing and post processing logics
 *     Routers are used to forward the requests to particular backend APIs.
 *     
 */

















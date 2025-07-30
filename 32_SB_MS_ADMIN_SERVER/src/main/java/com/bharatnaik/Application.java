package com.bharatnaik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer // we want to represents this application as a admin server that's why we are using this annotation.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/*
	   Admin server : 
	   -> So whenever we access admin server url we are getting one UI(User Interface)
	   -> In this UI(User Interface) so basically our backend APIs will registred with this admin server.
	      and Using this admin server we can monitor activator endpoints of all the backend APIs.   
 */

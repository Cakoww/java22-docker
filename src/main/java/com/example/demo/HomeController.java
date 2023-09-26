package com.example.demo;



import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/")
public class HomeController {

	Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public ResponseEntity<Object> getLoggingRequest(){
		
		
		logger.warn("Application is up, logging here in the root endopoint");
		return ResponseEntity.status(HttpStatus.OK).body("Application is up and running");
		
	}
}

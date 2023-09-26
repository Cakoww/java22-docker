package com.example.demo;

import org.slf4j.LoggerFactory;

//import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/api")
public class LoggingController {
	
	
	Logger logger = (Logger) LoggerFactory.getLogger(LoggingController.class);
	
	@GetMapping("/log")
	public ResponseEntity<Object> getLoggingRequest(){
		
		
		logger.warn("It is logging, we should see this message in the logger file");
		return ResponseEntity.status(HttpStatus.OK).body("We should see newer logs in the file.");
		
	}

}

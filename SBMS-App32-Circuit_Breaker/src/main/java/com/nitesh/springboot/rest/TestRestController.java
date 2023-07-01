package com.nitesh.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@CircuitBreaker(name = "test")
public class TestRestController {
	
	
	@GetMapping("/m1")
	public String m1() {
		
		System.out.println("***m1() method called***");
		
		int x = 10/0;
		
		return "reply from m1() method...";
	}
	
	public String m2(Exception e) {
		return "reply from m2() method...";
	}

}

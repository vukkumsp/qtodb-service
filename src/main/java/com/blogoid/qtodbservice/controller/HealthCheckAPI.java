package com.blogoid.qtodbservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckAPI {
	
	@GetMapping("isAlive")
	String isAlive() {
		return "Application is running";
	}
}

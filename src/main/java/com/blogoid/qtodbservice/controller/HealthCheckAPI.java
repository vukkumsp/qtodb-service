package com.blogoid.qtodbservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blogoid.qtodbservice.consumer.TestService;
import com.blogoid.qtodbservice.producer.QueueProducer;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class HealthCheckAPI {
	
//	@Autowired
//	QueueProducer producer;
	
//	@Autowired
//	TestService test1;
	
	@GetMapping("isAlive")
	String isAlive() {
		return "Application is running";
	}
	
//	@PostMapping("/saveblog")
//	boolean saveBlog(@RequestBody String blog) throws JsonProcessingException {
//		return producer.sendToQueue(blog);
//	}
}

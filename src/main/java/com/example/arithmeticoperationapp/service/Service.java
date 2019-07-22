package com.example.arithmeticoperationapp.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Service {

	
	@RequestMapping(path="/add/{input1}/{input2}")
	private Integer add(@PathVariable("input1") int input1, 
	        @PathVariable("input2") int input2) {

		return input1 + input2;
	}
	
	@GetMapping("/test")
	private String test() {
		return "Testing done!";
	}
	
	@GetMapping("/")
	private String test1() {
		return "<H1>This is spring-boot app <B>from Openshift Changes</B></H1>";
	}
}

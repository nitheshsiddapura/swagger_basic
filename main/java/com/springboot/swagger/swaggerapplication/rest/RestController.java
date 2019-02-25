package com.springboot.swagger.swaggerapplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
	@GetMapping("/hello")
	public String getHello()
	{
		return "hello-spring-world";
	}
	

}

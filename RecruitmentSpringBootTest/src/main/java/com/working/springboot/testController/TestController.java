package com.working.springboot.testController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring Boot Test!";
	}

}

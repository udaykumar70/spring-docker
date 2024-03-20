package com.example.springdockerimage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/docker")
	public String method1() {
		return "hello docker";
	}

}


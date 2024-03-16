package com.example.samplefortesting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping
public class controller {

	@GetMapping("/student")
	public void test() {
		System.out.println("testing");
	}
	@GetMapping("/testing")
	public String testmethod() {
		return "it is working";
	}

}

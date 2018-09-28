package com.abhi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampController {

	@GetMapping("/")
	public String defaultPath() {
		return "Hello from Dockerised Spring boot app!";
	}
	
	@GetMapping("/test")
	public String testPath() {
		return "Success!";
	}
}

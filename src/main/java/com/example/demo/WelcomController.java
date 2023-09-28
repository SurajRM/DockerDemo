package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome";
	}
}

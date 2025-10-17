package com.lab.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
public class ClientController {
	
	
	@GetMapping("")
	public String server() {
		return "<h1> Server Running </h1>";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "Server Profile";
	}
	
	@GetMapping("/home")
	public String home() {
		return "Server Home";
	}
}

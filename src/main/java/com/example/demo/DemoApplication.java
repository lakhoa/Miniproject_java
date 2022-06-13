package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(path = "/echo1")
	public String getEcho() {
		return "Echo 1.. 2.. 3.. 4";
	}

	@GetMapping(path = "/hello/{name}")
	public String helloApp(@PathVariable String name) {
		return "Hello " + name;
	}
}

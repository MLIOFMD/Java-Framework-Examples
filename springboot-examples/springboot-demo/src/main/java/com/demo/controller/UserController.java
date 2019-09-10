package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * url: http://localhost:8080/user/query
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping(value = "/query")
	public String query() {
		return "this is springboot controller !";
	}
}

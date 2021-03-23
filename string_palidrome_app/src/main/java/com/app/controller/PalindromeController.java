package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Data;
import com.app.service.PalindromeService;

@RestController
public class PalindromeController {

	@Autowired
	private PalindromeService service;
	
	@PostMapping("/")
	public Data findLargestPalindrome(@RequestBody Data data) {
		return service.findLargestPalindromeAndPersist(data);
	}
}

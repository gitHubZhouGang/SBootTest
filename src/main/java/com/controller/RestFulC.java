package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Model;

@RestController
@RequestMapping("/RestFul")
public class RestFulC {

	@Autowired
	Model model;
	@RequestMapping
	String home() {
		System.out.println("Come on");
		return "Ha!";
	}
	
	@RequestMapping("/index")
	String index() {
		System.out.println("Come on");
		return "Haq!";
	}
}

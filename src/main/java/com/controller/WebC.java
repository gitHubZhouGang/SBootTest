package com.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Web")
public class WebC {

	@RequestMapping
	String home() {
		return "WEB-INF/templates/index.jsp";
	}

	@RequestMapping("/error")
	String error() {
		BigDecimal c = null;
		c.doubleValue();
		return "/WEB-INF/templates/index.jsp";

	}
}

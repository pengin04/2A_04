package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Test {

	@RequestMapping(path = "/myForm", method = RequestMethod.GET)
	public String viewPage() {

		return "myForm";
	}

}

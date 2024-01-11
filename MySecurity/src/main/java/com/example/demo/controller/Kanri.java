package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Kanri {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(path = "/kanri", method = RequestMethod.GET)
	public String viewPage() {
		return "kanri";
	}
}

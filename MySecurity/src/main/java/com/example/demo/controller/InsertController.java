package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InsertController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	//一覧表示用
	@RequestMapping(path = "/insert", method = RequestMethod.GET)
	public String viewPage() {
		return "insert";
	}

	//ログイン検証用
	@RequestMapping(path = "/insert", method = RequestMethod.POST)
	public String loginPost(String classnum, String username, int email, String password, Model model) {
		jdbcTemplate.update("INSERT INTO made VALUES(?,?,?)", username, email, password);

		model.addAttribute("name", username);
		model.addAttribute("schoolnum", email);
		model.addAttribute("password", password);
		return "insert";
	}
}

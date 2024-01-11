package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Ins;
import com.example.demo.repository.TikokusRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	TikokusRepository tikokuRepository;

	@Autowired
	JdbcTemplate jdbcTemplate;

	//一覧表示用
	@RequestMapping(path = "/mylogin", method = RequestMethod.GET)
	public String viewPage() {

		return "mylogin";
	}

	//	@RequestMapping(path = "/insert", method = RequestMethod.POST)
	//	public String insertPost() {
	//		return "insert";
	//	}

	//ログイン検証用
	@RequestMapping(path = "/mylogin", method = RequestMethod.POST)
	public String loginPost(String schoolnum, String password, HttpSession session) {

		//ormapperパターン
		Ins ins = new Ins();
		int schoolnumint = Integer.parseInt(schoolnum);
		List<Ins> list = tikokuRepository.findBySchoolnumAndPassword(schoolnumint, password);

		//jdbcパターン
		List<Map<String, Object>> resultlist = jdbcTemplate
				.queryForList("SELECT * FROM made WHERE schoolnum = ?", schoolnumint);

		//		for(int i = 0; i < list.size();i++) {
		//			System.out.println(list.get(i).getName());
		//		}

		if (list.size() == 0) {
			//DBに存在しないデータが入れられた（ログイン失敗）
			return "mylogin";
		} else {
			//ログイン成功
			return "myhome";
		}
		//		if (schoolnum.equals(username)) {
		//			if (password.equals(password)) {
		//				return "myhome";
		//			}
		//			return "myhome";
		//		} else {
		//			return "mylogin";
		//		}

	}

	/*@RequestMapping(path = "/insert", method = RequestMethod.POST)
	public String first(String classnum, String name, String schoolnum, String password) {
	
		jdbcTemplate.update("INSERT INTO tikoku (class,name,schoolnum,password) VALUES(?,?,?,?);", classnum, name,
				schoolnum, password);
		return "insert";
	
	}*/

}
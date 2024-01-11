package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "made")
public class Ins {

	@jakarta.persistence.Id
	@jakarta.persistence.Column(name = "name")
	private String name;

	@jakarta.persistence.Column(name = "schoolnum")
	private int schoolnum;

	@jakarta.persistence.Column(name = "password")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSchoolnum() {
		return schoolnum;
	}

	public void setSchoolnum(int schoolnum) {
		this.schoolnum = schoolnum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

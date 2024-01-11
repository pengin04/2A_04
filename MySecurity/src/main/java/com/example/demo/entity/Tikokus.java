package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tikoku")
public class Tikokus {

	@jakarta.persistence.Id
	@jakarta.persistence.Column(name = "classnum")
	private String classnum;

	@jakarta.persistence.Column(name = "schoolnum")
	private int schoolnum;

	@jakarta.persistence.Column(name = "schoolyear")
	private String schoolyear;

	@jakarta.persistence.Column(name = "holiday")
	private String holiday;

	@jakarta.persistence.Column(name = "password")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSchoolnum() {
		return schoolnum;
	}

	public void setSchoolnum(int schoolnum) {
		this.schoolnum = schoolnum;
	}

	public String getSchoolyear() {
		return schoolyear;
	}

	public void setSchoolyear(String schoolyear) {
		this.schoolyear = schoolyear;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public String getBehindtime() {
		return behindtime;
	}

	public void setBehindtime(String behindtime) {
		this.behindtime = behindtime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@jakarta.persistence.Column(name = "classname")
	private String classname;

	@jakarta.persistence.Column(name = "attendance")
	private String attendance;

	@jakarta.persistence.Column(name = "behindtime")
	private String behindtime;

	@jakarta.persistence.Column(name = "name")
	private String name;
}
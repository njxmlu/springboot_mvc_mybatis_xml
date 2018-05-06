package com.xmlu.st.mybatis.exam.bean;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Year;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
	private int id;
	private String username;
	private int age;

	private Time time;
	private Date date;
	private Year year;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp ctm;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	public Timestamp getCtm() {
		return ctm;
	}

	// 反序列化一个固定格式的Date
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	public void setCtm(Timestamp ctm) {
		this.ctm = ctm;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", ctm=" + ctm + "]";
	}
}
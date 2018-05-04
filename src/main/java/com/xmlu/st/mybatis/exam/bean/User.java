package com.xmlu.st.mybatis.exam.bean;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

//import java.sql.Date;
public class User {
	private int id;
	private String username;
	private int age;

	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
	private Timestamp ctm;

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

	public Timestamp getCtm() {
		return ctm;
	}

	public void setCtm(Timestamp ctm) {
		this.ctm = ctm;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", ctm=" + ctm + "]";
	}
}
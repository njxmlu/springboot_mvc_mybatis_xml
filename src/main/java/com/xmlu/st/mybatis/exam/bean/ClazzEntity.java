package com.xmlu.st.mybatis.exam.bean;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ClazzEntity {

	private int clazzID;

	private String clazzName;

	private List<StudentEntity> studentList;

	public int getClassID() {
		return clazzID;
	}

	public int getClazzID() {
		return clazzID;
	}

	public void setClazzID(int clazzID) {
		this.clazzID = clazzID;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public List<StudentEntity> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentEntity> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
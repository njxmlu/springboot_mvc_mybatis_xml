package com.xmlu.st.mybatis.exam.bean;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class JsonResult<T> {

	private String status;

	private T result;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
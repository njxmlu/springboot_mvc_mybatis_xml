package com.xmlu.st.mybatis.exam.service;

import com.xmlu.st.mybatis.exam.bean.Employee;

public interface IEmployeePlusService {
	public Employee getEmpById(Integer id);

	public Employee getEmpAndDept(Integer id);

	public Employee getEmpByIdStep(Integer id);
}
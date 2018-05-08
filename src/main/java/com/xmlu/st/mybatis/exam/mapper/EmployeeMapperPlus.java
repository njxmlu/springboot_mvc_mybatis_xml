package com.xmlu.st.mybatis.exam.mapper;

import com.xmlu.st.mybatis.exam.bean.Employee;

public interface EmployeeMapperPlus {
	public Employee getEmpById(Integer id);

	public Employee getEmpAndDept(Integer id);

	public Employee getEmpByIdStep(Integer id);
}

package com.xmlu.st.mybatis.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmlu.st.mybatis.exam.bean.Employee;
import com.xmlu.st.mybatis.exam.mapper.EmployeeMapperPlus;
import com.xmlu.st.mybatis.exam.service.IEmployeePlusService;

@Service
public class EmployeePlusServiceImpl implements IEmployeePlusService {

	@Autowired
	private EmployeeMapperPlus empPlusMapper;

	@Override
	public Employee getEmpById(Integer id) {
		return empPlusMapper.getEmpById(id);
	}

	@Override
	public Employee getEmpAndDept(Integer id) {
		return empPlusMapper.getEmpAndDept(id);
	}

	@Override
	public Employee getEmpByIdStep(Integer id) {
		return empPlusMapper.getEmpByIdStep(id);
	}
}
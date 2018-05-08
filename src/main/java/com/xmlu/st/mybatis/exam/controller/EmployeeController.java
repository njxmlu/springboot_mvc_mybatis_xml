package com.xmlu.st.mybatis.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xmlu.st.mybatis.exam.bean.Employee;
import com.xmlu.st.mybatis.exam.bean.JsonResult;
import com.xmlu.st.mybatis.exam.service.IEmployeePlusService;

@RestController
public class EmployeeController {

	@Autowired
	private IEmployeePlusService empPlusService;

	/**
	 * 根据ID查询员工信息
	 * 
	 * @param id
	 * @return ResponseEntity
	 */
	@RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<JsonResult<Employee>> getUserById(@PathVariable(value = "id") Integer id) {
		JsonResult<Employee> r = new JsonResult<>();
		try {
			Employee employee = empPlusService.getEmpByIdStep(id);
			r.setResult(employee);
			r.setStatus("ok");
		} catch (Exception e) {
			JsonResult<String> error = new JsonResult<>();
			error.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}
}
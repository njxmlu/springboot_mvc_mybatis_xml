package com.xmlu.st.mybatis.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xmlu.st.mybatis.exam.bean.ClazzEntity;
import com.xmlu.st.mybatis.exam.bean.JsonResult;
import com.xmlu.st.mybatis.exam.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	private IStudentService stuService;

	/**
	 * 根据ID查询学生信息
	 * 
	 * @param id
	 * @return ResponseEntity
	 */
	@RequestMapping(value = "student/{classId}", method = RequestMethod.GET)
	public ResponseEntity<JsonResult<ClazzEntity>> getUserById(@PathVariable(value = "classId") Integer classId) {
		JsonResult<ClazzEntity> r = new JsonResult<>();
		try {
			ClazzEntity stuList = stuService.getClassByClassID(classId);
			r.setResult(stuList);
			r.setStatus("ok");
			System.out.println(stuList);
			System.out.println(r);
		} catch (Exception e) {
			JsonResult<String> error = new JsonResult<>();
			error.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}
}
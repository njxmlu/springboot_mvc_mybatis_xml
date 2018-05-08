package com.xmlu.st.mybatis.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmlu.st.mybatis.exam.bean.ClazzEntity;
import com.xmlu.st.mybatis.exam.mapper.StudentMapper;
import com.xmlu.st.mybatis.exam.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper stuMapper;

	@Override
	public ClazzEntity getClassByClassID(Integer classId) {
		return stuMapper.getClassByClassID(classId);
	}
}
package com.xmlu.st.mybatis.exam.service;

import com.xmlu.st.mybatis.exam.bean.ClazzEntity;

public interface IStudentService {

	ClazzEntity getClassByClassID(Integer classId);
}
package com.xmlu.st.mybatis.exam.mapper;

import org.springframework.stereotype.Repository;

import com.xmlu.st.mybatis.exam.bean.ClazzEntity;

@Repository
public interface StudentMapper {

	ClazzEntity getClassByClassID(Integer classId);
}

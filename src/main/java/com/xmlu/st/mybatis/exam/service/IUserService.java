package com.xmlu.st.mybatis.exam.service;

import java.util.List;

import com.xmlu.st.mybatis.exam.bean.User;

public interface IUserService {

	User getUserById(Integer id);

	public List<User> getUserList();

	public int add(User user);

	public int update(Integer id, User user);

	public int delete(Integer id);
}
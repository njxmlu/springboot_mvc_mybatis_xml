package com.xmlu.st.mybatis.exam.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.xmlu.st.mybatis.exam.bean.Employee;

public interface EmployeeMapper {

	// 多条记录封装一个map,Map<String,Employee>的key是这条记录的主键，值是这条记录封装成的javabean.
	@MapKey("id")
	// 这句话告诉mybatis封装这个map的时候使用哪个属性作为map的key
	public Map<Integer, Employee> getEmpBylastnameReturnMap(String lastName);

	// 返回一条记录的map,key就是列名，值就是对应的值
	public Map<String, Object> getEmpByIdReturnMap(Integer id);

	public List<Employee> getEmpByLastName(String lastName);

	public Employee getEmpById(Integer id);

	public void addEmp(Employee employee);

	public void updateEmp(Employee employee);

	public void deleteEmpById(Integer id);

}
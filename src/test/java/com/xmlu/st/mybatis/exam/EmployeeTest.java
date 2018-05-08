package com.xmlu.st.mybatis.exam;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.xmlu.st.mybatis.exam.bean.Employee;
import com.xmlu.st.mybatis.exam.mapper.EmployeeMapperPlus;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class EmployeeTest {

	/**
	 * Spring RestTemplate的便利替代，
	 * 
	 * @param 你可以获取一个普通的或发送基本HTTP认证（使用用户名和密码）的模板
	 */
	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private MockMvc mvc;

	@Autowired
	private EmployeeMapperPlus empMapper;

	// @Test
	public void testGetEmpByIdStep() {
		Employee employee = empMapper.getEmpByIdStep(1);
		System.out.println("-----测试完毕-------" + employee);
	}

	@Test
	public void testGetEmpByIdStepController() throws Exception {
		ResultActions andExpect = mvc.perform(MockMvcRequestBuilders.get("/employee/1"))
				.andExpect(MockMvcResultMatchers.status().isOk());

		MvcResult mvcResult = andExpect.andReturn();
		int status = mvcResult.getResponse().getStatus();
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println("-------------content: " + content);
		Assert.assertTrue("正确", status == 200);
	}
}
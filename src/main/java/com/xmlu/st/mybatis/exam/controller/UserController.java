package com.xmlu.st.mybatis.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xmlu.st.mybatis.exam.bean.JsonResult;
import com.xmlu.st.mybatis.exam.bean.User;
import com.xmlu.st.mybatis.exam.service.IUserService;

@RestController
public class UserController {

	@Autowired
	private IUserService userService;

	/**
	 * 根据ID查询用户
	 * 
	 * @param id
	 * @return ResponseEntity
	 */
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	public ResponseEntity<JsonResult<User>> getUserById(@PathVariable(value = "id") Integer id) {
		JsonResult<User> r = new JsonResult<>();
		try {
			User user = userService.getUserById(id);
			r.setResult(user);
			r.setStatus("ok");
		} catch (Exception e) {
			JsonResult<String> error = new JsonResult<>();
			error.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}

	/**
	 * 查询用户列表
	 * 
	 * @return ResponseEntity
	 */
	@RequestMapping(value = "users", method = RequestMethod.GET)
	public ResponseEntity<JsonResult<List<User>>> getUserList() {
		JsonResult<List<User>> r = new JsonResult<>();
		try {
			List<User> users = userService.getUserList();
			r.setResult(users);
			r.setStatus("ok");
		} catch (Exception e) {
			JsonResult<String> error = new JsonResult<>();
			error.setResult(e.getClass().getName() + ":" + e.getMessage());
			error.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "user", method = RequestMethod.POST)
	public ResponseEntity<JsonResult<Integer>> add(@RequestBody User user) {
		JsonResult<Integer> r = new JsonResult<>();
		try {
			int orderId = userService.add(user);
			if (orderId < 0) {
				r.setResult(orderId);
				r.setStatus("fail");
			} else {
				r.setResult(orderId);
				r.setStatus("ok");
			}
		} catch (Exception e) {
			JsonResult<String> error = new JsonResult<>();
			error.setResult(e.getClass().getName() + ":" + e.getMessage());
			error.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}

	/**
	 * 根据id删除用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<JsonResult<Integer>> delete(@PathVariable(value = "id") Integer id) {
		JsonResult<Integer> r = new JsonResult<>();
		try {
			int ret = userService.delete(id);
			if (ret < 0) {
				r.setResult(ret);
				r.setStatus("fail");
			} else {
				r.setResult(ret);
				r.setStatus("ok");
			}
		} catch (Exception e) {
			JsonResult<String> error = new JsonResult<>();
			error.setResult(e.getClass().getName() + ":" + e.getMessage());
			error.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}

	/**
	 * 根据id修改用户信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<JsonResult<Integer>> update(@PathVariable("id") Integer id, @RequestBody User user) {
		JsonResult<Integer> r = new JsonResult<>();
		try {
			int ret = userService.update(id, user);
			if (ret < 0) {
				r.setResult(ret);
				r.setStatus("fail");
			} else {
				r.setResult(ret);
				r.setStatus("ok");
			}
		} catch (Exception e) {
			JsonResult<String> error = new JsonResult<>();
			error.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}
}
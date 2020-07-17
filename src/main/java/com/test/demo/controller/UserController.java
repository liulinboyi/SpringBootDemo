package com.test.demo.controller;

import java.util.Date;

import com.test.demo.pojo.DemoJSONResult;
import com.test.demo.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController // RestController = Controller + ResponseBody
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	// @ResponseBody
	public DemoJSONResult getUserJson() {
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("123456");
		u.setDesc(null);
		return DemoJSONResult.ok(u);
	}
}

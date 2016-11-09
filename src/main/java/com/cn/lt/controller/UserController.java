package com.cn.lt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.lt.pojo.User;
import com.cn.lt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	public UserService userService;

	@RequestMapping("/shouUser")
	public String toIndex(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		System.out.println("--"+user);
		model.addAttribute("user", user);
		return "showUser";

	}
	@RequestMapping("/index")
	public String toIndex(HttpServletRequest request) {
		System.out.println("--s");
		return "index";

	}
}

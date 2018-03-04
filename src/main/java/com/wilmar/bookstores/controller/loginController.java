package com.wilmar.bookstores.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wilmar.bookstores.Entity.UserEntity;
import com.wilmar.bookstores.service.UserService;

@Controller
public class loginController {
	@Autowired
	UserService userService;
	@Autowired
	UserEntity userEntity;

	/*@RequestMapping("/login")
	public String login(HttpServletRequest req) {
		String result = "";
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("从前台传过来的username   " + username);
		userEntity = userService.getUserByUserName(username);
		if (userEntity != null) {
			System.out.println("=============查到了==============");
			System.out.println("userEntity 是个什么东西    "+ userEntity.toString());
			if (userEntity.getUserName().equals(username) && userEntity.getPassWord().equals(password)) {
				System.out.println("===========suc====");
				result = "welcome";
			}
		} else {
			result = "login";
		}
		System.out.println("===========" + result);
		return result;
	}*/

	@RequestMapping("/")
	public String toLogin() {

		System.out.println("=====怎么什么都不打印  =====");
		return "login";
	}
}

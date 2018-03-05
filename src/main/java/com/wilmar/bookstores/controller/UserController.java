package com.wilmar.bookstores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilmar.bookstores.Entity.UserEntity;
import com.wilmar.bookstores.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired       
	UserService userService;
	@Autowired
	UserEntity userEntity;
	@RequestMapping("/list")
	public String getAllUser(Model model){
		List<UserEntity> userList = userService.getAllUser();
		model.addAttribute("list",userList);
		return "user/list";
	}
	
	@RequestMapping("/userInfo/{userName}")
	public String getUserByUserName(@PathVariable String userName,Model model){
		userEntity = userService.getUserByUserName(userName);
		model.addAttribute("userEntity", userEntity);
		return "user/userInfo";
	}
}

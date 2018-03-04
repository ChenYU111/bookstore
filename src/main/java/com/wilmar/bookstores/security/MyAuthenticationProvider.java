package com.wilmar.bookstores.security;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.wilmar.bookstores.service.UserService;

@Service("MyAuthenticationProvider")
public class MyAuthenticationProvider implements AuthenticationProvider {
	@Autowired
	UserService userService;
	@Autowired
	UserDetailService UserDetailService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = authentication.getName();
		String password = (String)authentication.getCredentials();
		System.out.println("用户输入 用户的密码     " +password);
		UserDetail user = UserDetailService.loadUserByUsername(username);
		System.out.println("根据用户输入的用户名 user 查到来了   将要判断密码是不是跟输入的一样");
		//user的密码为null
		if (user != null) {
			System.out.println("用户的密码     " +user.getPassword());
			if (!user.getPassword().equals(password)) {
				throw new BadCredentialsException("用户名密码错误");
			}
		} else {
			throw new BadCredentialsException("用户不存在");
		}
		return new UsernamePasswordAuthenticationToken(username,password,user.getAuthorities());
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}

package com.wilmar.bookstores.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wilmar.bookstores.Entity.UserEntity;
import com.wilmar.bookstores.service.UserService;
@Service("UserDetailService")
public class UserDetailService implements UserDetailsService{
	@Autowired
	UserService userService;
	@Autowired
	UserEntity userEntity;
	@Override
	public UserDetail loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		userEntity = userService.getUserByUserName(username);
		return new UserDetail(userEntity);
	}
}

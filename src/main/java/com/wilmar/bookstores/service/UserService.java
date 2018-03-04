package com.wilmar.bookstores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilmar.bookstores.Entity.UserEntity;
import com.wilmar.bookstores.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	UserEntity userEntity;

	public List<UserEntity> getAllUser() {
		List<UserEntity> userList = userMapper.getAll();
		return userList;
	}

	public UserEntity getUserByUserName(String username) {
		userEntity = userMapper.getUserByUserName(username);
		System.out.println("路过service");
		if (userEntity != null) {
			System.out.println("service  ++++  mapper" + userEntity.getUserName());
		}
		return userEntity;
	}
}

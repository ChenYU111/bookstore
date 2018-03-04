package com.wilmar.bookstores.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.wilmar.bookstores.Entity.UserEntity;

public interface UserMapper {
	@Select("select * From user")
	List<UserEntity> getAll();
	@Select("select * From user where username=#{username}")
	UserEntity getUserByUserName(String username);
}

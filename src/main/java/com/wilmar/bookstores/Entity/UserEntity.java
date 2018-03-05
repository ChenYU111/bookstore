package com.wilmar.bookstores.Entity;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.wilmar.bookstores.Enum.UserSexEnum;


@Repository
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username; 
	private String passWord;
	private String uname;     
	private String profession;
	private String major;
	private String gender;
	private Integer uid;
	private Integer status;
	private String password;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + username + ", passWord=" + passWord + ", uname=" + uname
				+ ", profession=" + profession + ", major=" + major + ", gender=" + gender + ", uid=" + uid + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
}

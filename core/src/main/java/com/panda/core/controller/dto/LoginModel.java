package com.panda.core.controller.dto;

import com.panda.core.util.Mensages;

public class LoginModel extends Mensages {
	
	public String username;
	public String password;
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

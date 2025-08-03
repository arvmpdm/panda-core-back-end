package com.panda.core.controller.dto;

import com.panda.core.util.Mensages;

public class LoginModel extends Mensages {
	
	public String userName;
	public String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

package com.cg.farmstore.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credentials {
	
	@Id
	private String userName;
	private String password;
	private UserType userType;
	
	public Credentials() {
		super();
	}

	public Credentials(String userName, String password, UserType userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}

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

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Credentials [userName=" + userName + ", password=" + password + ", userType=" + userType + "]";
	}

}

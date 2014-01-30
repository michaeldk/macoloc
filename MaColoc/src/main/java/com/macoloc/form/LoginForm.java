package com.macoloc.form;

import org.hibernate.validator.constraints.NotBlank;

public class LoginForm {
	
	@NotBlank
	private String userName;
	
	@NotBlank
	private String password;

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

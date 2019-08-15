package com.ot.mkyong.user.form;

import org.apache.struts.validator.ValidatorForm;

public class UserForm extends ValidatorForm {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8493084999314528905L;
	
	private String username;
	private String pwd;
	private String pw2;
	private String email;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getPw2() {
		return pw2;
	}
	
	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}

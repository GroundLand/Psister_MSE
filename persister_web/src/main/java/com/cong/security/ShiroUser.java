package com.cong.security;

import java.util.Date;

public class ShiroUser {
	
	private String userId;
	private String loginName;
	private String photo;
	private String loginIp;
	private Date   loginDate;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public ShiroUser() {
		super();
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	
}

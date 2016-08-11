package com.lollibond.chat.data;

/*
 * A group of light weight pojos to accomodate different events related to notifications and chat service
 */

public class RegisterPayload {
		
	String userId;
	String initialmessage;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getInitialmessage() {
		return initialmessage;
	}
	public void setInitialmessage(String initialmessage) {
		this.initialmessage = initialmessage;
	}
	
	
}

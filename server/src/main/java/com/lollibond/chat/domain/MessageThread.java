package com.lollibond.chat.domain;

import java.util.Date;

public class MessageThread {


	String tid;
	Date ts;
	String msg;
	String attachement;
	String fromuid;
	
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public Date getTs() {
		return ts;
	}
	public void setTs(Date ts) {
		this.ts = ts;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAttachement() {
		return attachement;
	}
	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}
	public String getFromuid() {
		return fromuid;
	}
	public void setFromuid(String fromuid) {
		this.fromuid = fromuid;
	}
	
	
	
	
}

package com.lollibond.chat.domain;

import java.util.Date;

public class ThreadList {

	String uid;
	String tid;
	Date lastread_time;
	Date firstmsg_time;
	boolean hidden;
	Date hidefrom_date;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public Date getLastread_time() {
		return lastread_time;
	}
	public void setLastread_time(Date lastread_time) {
		this.lastread_time = lastread_time;
	}
	public Date getFirstmsg_time() {
		return firstmsg_time;
	}
	public void setFirstmsg_time(Date firstmsg_time) {
		this.firstmsg_time = firstmsg_time;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public Date getHidefrom_date() {
		return hidefrom_date;
	}
	public void setHidefrom_date(Date hidefrom_date) {
		this.hidefrom_date = hidefrom_date;
	}
	
	
	
}

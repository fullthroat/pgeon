package com.lollibond.chat.data;

import java.util.Date;
import java.util.List;

public class NotificationCodec {

	List<String> actorsUidList;
	String action;
	Object on;
	Object where;
	Date when;

	public List<String> getActorsUidList() {
		return actorsUidList;
	}

	public void setActorsUidList(List<String> actorsUidList) {
		this.actorsUidList = actorsUidList;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Object getOn() {
		return on;
	}

	public void setOn(Object on) {
		this.on = on;
	}

	public Object getWhere() {
		return where;
	}

	public void setWhere(Object where) {
		this.where = where;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

}

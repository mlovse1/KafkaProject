package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String msg;
	private Date timestamp;

	public Message() {

	}

	public Message(String msg, Date timestamp) {
		super();
		this.msg = msg;
		this.timestamp = timestamp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Message [msg=" + msg + ", timestamp=" + timestamp + "]";
	}

}

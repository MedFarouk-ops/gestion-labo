package com.example.demo.beans;

import java.util.Date;

public class OutilBean {
	Long id;
	Date dateOutil;
	String source;
	public OutilBean(Long id, Date dateOutil, String source) {
		super();
		this.id = id;
		this.dateOutil = dateOutil;
		this.source = source;
	}
	public OutilBean() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateOutil() {
		return dateOutil;
	}
	public void setDateOutil(Date dateOutil) {
		this.dateOutil = dateOutil;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
}

package com.example.demo.beans;

import java.util.Date;

public class EvenementBean {
	Long id;
	Date dateOutil;
	String titre, lieu;
	public EvenementBean(Long id, Date dateOutil, String titre, String lieu) {
		super();
		this.id = id;
		this.dateOutil = dateOutil;
		this.titre = titre;
		this.lieu = lieu;
	}
	public EvenementBean() {
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
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	
}

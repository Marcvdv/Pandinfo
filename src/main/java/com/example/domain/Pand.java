package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String straat;
	private String nummer;
	private String soort;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getStraat() {
		return straat;
	}
	public void setStraat(String straat) {
		this.straat = straat;
	}
	public String getNummer() {
		return nummer;
	}
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	public String getSoort() {
		return soort;
	}
	public void setSoort(String soort) {
		this.soort = soort;
	}
	@Override
	public String toString() {
		return "Pand [id=" + id + ", straat=" + straat + ", nummer=" + nummer + ", soort=" + soort + "]";
	}
}

package com.dvreznik.g;

import java.util.Date;

import javax.xml.crypto.Data;

public class Pidpriemstvo {
	
	private int id;
	private String name_p;
	private String adressa_p;
	private Date data;
	private float fond;
	private String ker_p;
	private int kod_dil;
	private float rob_misc;
	
	public Pidpriemstvo(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName_p() {
		return name_p;
	}
	public void setName_p(String name_p) {
		this.name_p = name_p;
	}
	public String getAdressa_p() {
		return adressa_p;
	}
	public void setAdressa_p(String adressa_p) {
		this.adressa_p = adressa_p;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getFond() {
		return fond;
	}
	public void setFond(float fond) {
		this.fond = fond;
	}
	public String getKer_p() {
		return ker_p;
	}
	public void setKer_p(String ker_p) {
		this.ker_p = ker_p;
	}
	public int getKod_dil() {
		return kod_dil;
	}
	public void setKod_dil(int kod_dil) {
		this.kod_dil = kod_dil;
	}
	public float getRob_misc() {
		return rob_misc;
	}
	public void setRob_misc(float rob_misc) {
		this.rob_misc = rob_misc;
	}
	

	@Override
	public String toString() {
		return id +"\t"+ name_p +"\t"+ adressa_p +"\t"+ data +"\t"+ fond +"\t"+ ker_p +"\t"+ kod_dil +"\t"+ rob_misc;
	}
}

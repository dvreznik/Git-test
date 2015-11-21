package com.dvreznik.g;

import java.util.Date;

public class Pidpriemstvo {
	
	private int id;
	private String name_p;
	private String adressa_p;
	private Date data;
	private float fond;
	private String ker_p;
	private int id_d;
	private float rob_misc;
		
	public Pidpriemstvo(){}
	
	
	public Pidpriemstvo(int id, String name_p, String adressa_p, Date data, float fond, String ker_p, int id_d,
			float rob_misc) {
		super();
		this.id = id;
		this.name_p = name_p;
		this.adressa_p = adressa_p;
		this.data = data;
		this.fond = fond;
		this.ker_p = ker_p;
		this.id_d = id_d;
		this.rob_misc = rob_misc;
	}


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
	public int getId_d() {
		return id_d;
	}
	public void setId_d(int id_d) {
		this.id_d = id_d;
	}
	public float getRob_misc() {
		return rob_misc;
	}
	public void setRob_misc(float rob_misc) {
		this.rob_misc = rob_misc;
	}
	

	@Override
	public String toString() {
		return id +"\t"+ name_p +"\t"+ adressa_p +"\t"+ data +"\t"+ fond +"\t"+ ker_p +"\t"+ id_d +"\t"+ rob_misc;
	}
}

package com.dvreznik.g;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dispatcher {
	
	public static void main(String[] args) {
	Pidpriemstvo pidp = new Pidpriemstvo();	
	Connector cn = new Connector();	
	String querry = "select * from pidp order by id_p";
	try {
		Statement statement = cn.getConnection().createStatement();
		ResultSet resset = statement.executeQuery(querry);
		
		while(resset.next()){
			
			pidp.setId(resset.getInt("id_p"));
			pidp.setName_p(resset.getString("name_p"));
			pidp.setAdressa_p(resset.getString("adresa_p"));
			pidp.setData(resset.getDate("data_reg"));
			pidp.setFond(resset.getFloat("fond"));
			pidp.setKer_p(resset.getString("ker_p"));
			pidp.setKod_dil(resset.getInt("kod_dil"));
			pidp.setRob_misc(resset.getInt("rob_misc"));
			System.out.println(pidp);
			
		}
		statement.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}

	}

}

package com.dvreznik.g;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@SuppressWarnings("restriction")
public class CreateList {

	public static ObservableList<Pidpriemstvo> getList() {
		ObservableList<Pidpriemstvo> list = FXCollections.observableArrayList();
		Connector cn = new Connector();
		String querry = "SELECT id_p, name_p, adresa_p, data_reg, fond, ker_p, id_d, rob_misc FROM pidp ORDER BY id_p";
		try {
			Statement statment = cn.getConnection().createStatement();
			ResultSet resset = statment.executeQuery(querry);
			while(resset.next()){
//				list.add(new Pidpriemstvo(resset.getInt("id_p"), resset.getString("name_p"), resset.getString("adressa_p"),
//						resset.getDate("data"), resset.getFloat("fond"), resset.getString("ker_p"), resset.getInt("id_d"),
//						resset.getInt("rob_misc")));
				int id = resset.getInt("id_p");
				String name_p = resset.getString("name_p");
				String adressa_p = resset.getString("adresa_p");
				Date data_reg = resset.getDate("data_reg");
				float fond = resset.getFloat("fond");
				String ker_p = resset.getString("ker_p");
				int id_d = resset.getInt("id_d");
				int rob_misc = resset.getInt("rob_misc");
				list.add(new Pidpriemstvo(id, name_p, adressa_p, data_reg, fond, ker_p, id_d, rob_misc) );
			}
			statment.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Pidpriemstvo p:list){
			System.out.println(p);
		}
		return list;
	}

}

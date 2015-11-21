package com.dvreznik.g;

import java.util.Date;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Observable;

@SuppressWarnings("restriction")
public class Dispatcher extends Application {

	Stage window;
	TableView<Pidpriemstvo> table;

	public static void main(String[] args) {
		launch(args);
		// Pidpriemstvo pidp = new Pidpriemstvo();
		// Connector cn = new Connector();
		// String querry = "select * from pidp order by id_p";
		// try {
		// Statement statement = cn.getConnection().createStatement();
		// ResultSet resset = statement.executeQuery(querry);
		//
		// while (resset.next()) {
		//
		//// pidp.setId(resset.getInt("id_p"));
		//// pidp.setName_p(resset.getString("name_p"));
		//// pidp.setAdressa_p(resset.getString("adresa_p"));
		//// pidp.setData(resset.getDate("data_reg"));
		//// pidp.setFond(resset.getFloat("fond"));
		//// pidp.setKer_p(resset.getString("ker_p"));
		//// pidp.setKod_dil(resset.getInt("id_d"));
		//// pidp.setRob_misc(resset.getInt("rob_misc"));
		//// System.out.println(pidp);
		// }
		// statement.close();
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		//
	}

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Data Base");

		// ID Column
		TableColumn<Pidpriemstvo, Integer> idColumn = new TableColumn<>("ID");
		idColumn.setMinWidth(20);
		idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

		// name_p Column
		TableColumn<Pidpriemstvo, String> name_pColumn = new TableColumn<>("Company");
		name_pColumn.setMinWidth(150);
		name_pColumn.setCellValueFactory(new PropertyValueFactory<>("name_p"));

		// adresa_p Column
		TableColumn<Pidpriemstvo, String> adresa_pColumn = new TableColumn<>("Company adress");
		adresa_pColumn.setMinWidth(200);
		adresa_pColumn.setCellValueFactory(new PropertyValueFactory<>("adressa_p"));

		// data Column
		TableColumn<Pidpriemstvo, Date> dataColumn = new TableColumn<>("Data regestration");
		dataColumn.setMinWidth(100);
		dataColumn.setCellValueFactory(new PropertyValueFactory<>("data"));

		// fond Column
		TableColumn<Pidpriemstvo, Float> fondColumn = new TableColumn<>("Company fond");
		fondColumn.setMinWidth(50);
		fondColumn.setCellValueFactory(new PropertyValueFactory<>("fond"));

		// ker_p Column
		TableColumn<Pidpriemstvo, String> ker_pColumn = new TableColumn<>("Leader");
		ker_pColumn.setMinWidth(150);
		ker_pColumn.setCellValueFactory(new PropertyValueFactory<>("ker_p"));

		// id_d Column
		TableColumn<Pidpriemstvo, Integer> id_dColumn = new TableColumn<>("Activity");
		id_dColumn.setMinWidth(50);
		id_dColumn.setCellValueFactory(new PropertyValueFactory<>("id_d"));

		// rob_misc Column
		TableColumn<Pidpriemstvo, Integer> rob_miscColumn = new TableColumn<>("Working places");
		rob_miscColumn.setMinWidth(100);
		rob_miscColumn.setCellValueFactory(new PropertyValueFactory<>("rob_misc"));
		
		table = new TableView<>();
		table.setItems(CreateList.getList());
		table.getColumns().addAll(idColumn,name_pColumn,adresa_pColumn,dataColumn,fondColumn,ker_pColumn,id_dColumn,rob_miscColumn);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table);
		
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
		

	}

}

package com.dvreznik.g;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	private static final String URL="jdbc:postgresql://localhost:5432/biznes";
	private static final String USERNAME="postgres";
	private static final String PASSWORD="dima1985";
	private Connection connection;
	
	public Connector(){
		
		try {
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
	
}

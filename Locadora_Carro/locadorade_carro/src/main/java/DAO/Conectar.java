package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

	public Connection conectaBD() throws SQLException {

		String connectionUrl = "jdbc:postgresql:postgres";
		String user = "postgres";
		String password = "postgres";
		
		try {
			Connection conn = DriverManager.getConnection(connectionUrl, user, password);
			return conn;
		} catch (SQLException e) {
			 throw new RuntimeException(e);
		}
		
		

	}

}

package com.org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/Sanjay";
		String name = "root";
		String password = "sanjay1997";
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, name, password);
		return con;
	}
}

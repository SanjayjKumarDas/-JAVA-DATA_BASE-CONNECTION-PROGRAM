package com.org.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DB_Connection {

	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/Employee";
		String username = "root";
		String password = "sanjay1997";
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection(url, username, password);
		System.out.println("Printing connection object" + con);

		return con;

	}

}

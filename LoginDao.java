package com.org.logindao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.org.connection.DBConnection;
import com.org.login.Login;

public class LoginDao {
	public String register(Login login) throws ClassNotFoundException, SQLException {
		String userName = login.getUserName();
		String password = login.getPasswod();
		Connection con = null;
		PreparedStatement prepare = null;
		con = DBConnection.createConnection();
		String query = "insert into Raj(userName,password)values(?,?)";
		prepare = con.prepareStatement(query);
		prepare.setString(1, userName);
		prepare.setString(2, password);
		int i = prepare.executeUpdate();
		if (i != 0) {
			return "Success";
		}
		return "Wrong";
	}
}

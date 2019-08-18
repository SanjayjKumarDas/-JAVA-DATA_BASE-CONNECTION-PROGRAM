package com.org.Dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.org.connection.DB_Connection;
import com.org.model.Login;

public class LoginDao {

	public String registerCustomer(Login login) throws SQLException, ClassNotFoundException {
		String firstname = login.getFirstname();
		String lastname = login.getLastname();
		String email = login.getEmail();
		String password = login.getPassword();
		String address = login.getAddress();
		String address2 = login.getAddress2();
		String city = login.getCity();
		String state = login.getState();
		String zip = login.getZip();

		Connection con = null;
		java.sql.PreparedStatement prepare = null;
		try {
			con = DB_Connection.createConnection();
			String query = "insert into Employee(firstname,lastname,email,password,address,address2,city,state,zip) values (?,?,?,?,?,?,?,?,?)";
//		Insert Employee Details into Employee Table
			prepare = con.prepareStatement(query);
			prepare.setString(1, firstname);
			prepare.setString(2, lastname);
			prepare.setString(3, email);
			prepare.setString(4, password);
			prepare.setString(5, address);
			prepare.setString(6, address2);
			prepare.setString(7, city);
			prepare.setString(8, state);
			prepare.setString(9, zip);
			int i = prepare.executeUpdate();
			if (i != 0) {
				return "Success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Wrong";
	}

}

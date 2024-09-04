package com.showroom.showroomutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databaseutil {
	
	public static Connection createconnection(String url,String username,String password)throws SQLException{
		Connection connection=DriverManager.getConnection(url, username, password);
		return connection;
	}
	
	public static Statement createstatement(Connection connection) throws SQLException{
		return connection.createStatement();
	}

	public static ResultSet generateResultSet(Statement statement, String query) throws SQLException {
		ResultSet rs = statement.executeQuery(query);
		return rs;
	}
}

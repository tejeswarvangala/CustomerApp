package com.cts.teja.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcHelper {
	private static Connection connection;

	public static void openConnection() throws SQLException {
		PropertyReader propertyreader = new PropertyReader();
		String userName = propertyreader.getProperty("username");
		String password = propertyreader.getProperty("password");
		String url = propertyreader.getProperty("url");
		String driver = propertyreader.getProperty("jdbcDriver");
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			openConnection();
		}
		return connection;
	}

	public static void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}
}

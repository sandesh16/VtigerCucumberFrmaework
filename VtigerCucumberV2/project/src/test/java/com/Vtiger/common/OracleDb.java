package com.Vtiger.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class OracleDb {

	private static Connection connection = null;
	public static String dbUsername;
	public static String dbPassword;
	public static String dbConnectionString;

	public static Connection openDbConnection() throws SQLException {
		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
		}
		System.out.println("Oracle JDBC Driver Registered!");

		//Enter user name and password
		dbUsername = "";
		dbPassword = "";
		dbConnectionString = "";
				
		try {
			connection = DriverManager.getConnection(dbConnectionString, dbUsername, dbPassword);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");

		} else {
			System.out.println("Failed to make connection!");
		}
		return connection;
	}
}
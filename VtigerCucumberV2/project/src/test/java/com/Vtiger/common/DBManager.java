package com.Vtiger.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	private static Connection con = null;

	public static Connection openDBConnection_Mssql(String hostUserPswd)
			throws SQLException, ClassNotFoundException, IOException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		Connection con = DriverManager.getConnection(hostUserPswd);

		try {
			if (!con.isClosed())
				System.out.println("Successfully connected to SQL server");

		} catch (Exception e) {
			System.err.println("There is some exception in openDBConnection_Mssql: " + e.getMessage());
			con.close();
		}
		return con;
	}

	public static ResultSet getDataBaseTableData(String hostUserPswd, String query)
			throws ClassNotFoundException, SQLException, IOException {
		ResultSet rs = null;
		try {
			Connection con = openDBConnection_Mssql(hostUserPswd);
			Statement st = con.createStatement();
			System.out.println(st);

			rs = st.executeQuery(query);
			con.close();
		} catch (SQLException e) {
			System.out.println("There is some exception in getDataBaseTableData" + e.getMessage());
			con.close();
		}
		return rs;

	}

	public static void executeQryNoReturn(String hostUserPswd, String query)
			throws ClassNotFoundException, SQLException, IOException {

		try {
			con = openDBConnection_Mssql(hostUserPswd);
			Statement st = con.createStatement();
			System.out.println(st);
			st.execute(query);
			con.close();
		} catch (SQLException e) {
			System.out.println("There is some exception in executeQryNoReturn" + e.getMessage());
			con.close();
		}

	}

	public static int getDataBaseTableData_WithRoundOf(String hostUserPswd, String query)
			throws ClassNotFoundException, SQLException, IOException {
		ResultSet rs = null;
		int value = 0;
		try {
			Connection con = openDBConnection_Mssql(hostUserPswd);
			Statement st = con.createStatement();
			System.out.println(st);
			rs = st.executeQuery(query);
			while (rs.next()) {
				value = Math.round(rs.getInt(1));
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("There is some exception in getDataBaseTableData" + e.getMessage());
			con.close();
		}
		return value;
	}
}

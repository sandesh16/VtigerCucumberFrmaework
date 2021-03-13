package com.Vtiger.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DBUtilities  {

	private static Connection connection = null;
	List<String> month = Arrays.asList("JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV",
			"DEC");

	public static boolean updateQuery(String query, String info) {
		boolean flag = false;
		try {
			connection = OracleDb.openDbConnection();
			System.out.println("Db connected successfully: " + info);
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			System.out.println("result :" + result);
			if (result == 1) {
				flag = true;
				System.out.println("Record updated successfully: " + info);
			}
		} catch (Exception e) {
			System.out.println("Error while updating record: " + info);
			e.printStackTrace();
		}
		return flag;
	}

	public static String selectQuery(String query, String columnName, String info) {
		String columnValue = null;
		ResultSet rs = null;
		try {
			connection = OracleDb.openDbConnection();
			System.out.println("Db connected successfully: " + info);
			Statement statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				columnValue = rs.getString(columnName);
				System.out.println(columnValue);
			}
		} catch (SQLException e) {
			System.out.println("Error while selecting record: " + info);
			e.printStackTrace();
		}
		return columnValue;
	}

	public static List<String> selectQueryList(String query, String columnName, String info) {
		List<String> columnValue = new ArrayList<>();
		ResultSet rs = null;
		try {
			connection = OracleDb.openDbConnection();
			System.out.println("Db connected successfully: " + info);
			Statement statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				String value = rs.getString(columnName);
				/* System.out.println(value); */
				columnValue.add(value);
			}
		} catch (Exception e) {
			System.out.println("Error while selecting record: " + info);
			e.printStackTrace();
		}
		return columnValue;
	}

	public static boolean deleteRecord(String tableName, String columnName, String columnValue, String info) {
		boolean flag = false;
		try {
			connection = OracleDb.openDbConnection();
			System.out.println("Db connected successfully: " + info);
			Statement statement = connection.createStatement();
			String query = "delete  from " + tableName + " where " + columnName + "='" + columnValue + "'";
			int deleted = statement.executeUpdate(query);
			System.out.println("deleted :" + deleted);
			if (deleted == 1) {
				flag = true;
				System.out.println("Record updated successfully: " + info);
			}

		} catch (Exception e) {
			System.out.println("Error while deleting record: " + info);
			/* e.printStackTrace(); */

		} finally {
			System.out.println("..........continue.......");

		}
		return flag;
	}

	public static boolean deleteRecord(String tableName, String columnName1, String columnValue1, String columnName2,
			String columnValue2, String info) {
		boolean flag = false;
		try {
			connection = OracleDb.openDbConnection();
			System.out.println("Db connected successfully: " + info);
			Statement statement = connection.createStatement();
			String query = "delete from " + tableName + " where " + columnName1 + "='" + columnValue1 + "' and "
					+ columnName2 + "='" + columnValue2 + "'";
			int deleted = statement.executeUpdate(query);
			System.out.println("deleted :" + deleted);
			if (deleted == 1) {
				flag = true;
				System.out.println("Record updated successfully: " + info);
			}

		} catch (Exception e) {
			System.out.println("Error while deleting record: " + info);
			/* e.printStackTrace(); */

		} finally {
			System.out.println("..........continue.......");

		}
		return flag;
	}

	public static List<String> selectQuery(String query, String info) {
		ArrayList<String> columnValues = new ArrayList<String>();
		// int columncount=columnName.size();
		// System.out.println("columncount "+columncount);
		ResultSet rs = null;
		try {
			connection = OracleDb.openDbConnection();
			System.out.println("Db connected successfully: " + info);
			// Statement statement = connection.createStatement();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			// preparedStatement.setInt(1, 1000);
			rs = preparedStatement.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					columnValues.add(rs.getString(i));
				}

			}
		} catch (Exception e) {
			System.out.println("Error while selecting record: " + info);
			e.printStackTrace();
		}
		return columnValues;
	}
}
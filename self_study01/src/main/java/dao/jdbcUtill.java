package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcUtill {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection connect() {	// auto-commit
		try {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "icia", "1111");
			return connection;
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void close(ResultSet resultSet) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement preparedStatement) {
		try {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

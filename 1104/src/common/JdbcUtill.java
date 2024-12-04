package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtill {
		static {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		public static Connection connect() {
			try {
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "icia", "1111");
				connection.setAutoCommit(false);
				return connection;
			} 
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public static void close(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static void commit(Connection connection) {
			try {
				connection.commit();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static void rollback(Connection connection) {
			try {
				connection.rollback();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
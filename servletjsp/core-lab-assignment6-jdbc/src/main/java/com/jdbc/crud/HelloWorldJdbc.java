package com.jdbc.crud;
//import the package
import java.sql.*;

import com.mysql.jdbc.Driver;
public class HelloWorldJdbc {

	public static void main(String[] args) throws SQLException {
		//2. load the driver Jdbc 4.X loading driver is a slow process
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("done");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. connection object
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:3306/yms21", "root", "root");
			// SQL injection			No SQL injection
			//poor performance			good per, driver can cached the query
			//Statement, 			PrepparedStatement, CallableStatemnt
			
			Statement stmt=connection.createStatement();
			
			//executeQuery vs executeUpdate
			
			ResultSet rs=stmt.executeQuery("select * FROM emp1");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+":"+rs.getString("name")+":"+rs.getDouble("salary")
				+":"+rs.getString("dept"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

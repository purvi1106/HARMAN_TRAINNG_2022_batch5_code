package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.empapp.factory.ConnectionFactory;


public class ShowAllJdbcWithConnectionFactory {
	
	public static void main(String[] args) {
	
		Statement stmt=null;
		ResultSet rs=null;
		Connection connection=null;
		
		try {
			 connection=ConnectionFactory.getConnection();
			
			stmt=connection.createStatement();
			rs=stmt.executeQuery("select * from emp");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getDouble("salary"));
				System.out.println(rs.getInt("age"));
			}
		} catch (SQLException e) {
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

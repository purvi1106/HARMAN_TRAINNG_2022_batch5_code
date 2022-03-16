package com.jdbc.crud2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.jdbc.crud.ConnectionFactory;

public class DemoAutoGenKey {
	
	private static final String INSERT_INTO_EMP1 = 
			"insert into emp1(name, salary, dept) values(?,?,?)";

	public static void main(String[] args) {
		
		Connection  connection=ConnectionFactory.getConnection();
		
		try {
			PreparedStatement pstmt=connection.
					prepareStatement(INSERT_INTO_EMP1, Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, "rajat");
			pstmt.setDouble(2, 29);
			pstmt.setString(3, "Sales");
			//if u are changing the stae of db then for executeUpdate
			//i u just want to print the data executeQuery
			//execute: both : when u are taking a query at run time
			
			int noOfRowsEffected=pstmt.executeUpdate();
			
			if(noOfRowsEffected>0) {
				ResultSet rs=pstmt.getGeneratedKeys();
				if(rs.next()) {
					System.out.println(rs.getInt(1));
				}
			}
			
			System.out.println(noOfRowsEffected);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

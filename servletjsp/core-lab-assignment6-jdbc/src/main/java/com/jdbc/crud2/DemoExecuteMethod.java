package com.jdbc.crud2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.jdbc.crud.ConnectionFactory;
public class DemoExecuteMethod {

	public static void main(String[] args) {
		
		Connection connection=ConnectionFactory.getConnection();
		
		Scanner scanner=new Scanner(System.in);
		String query=scanner.nextLine();
		try {
			PreparedStatement pstmt=connection.prepareStatement(query);
			boolean status =pstmt.execute();
			//if it return true then it is a select kind of query ... update
			if(status==true) {
				ResultSet rs=pstmt.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt(1));
				}
			}else {
				int count=pstmt.getUpdateCount();
				System.out.println(count);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

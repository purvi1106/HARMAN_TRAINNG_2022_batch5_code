package com.jdbc.crud2;
import java.sql.*;
import java.util.*;

import com.jdbc.crud.ConnectionFactory;
public class DemoCallStoreProcedure {

	public static void main(String[] args) {
		Connection connection=ConnectionFactory.getConnection();
		try {
			CallableStatement cstmt=connection
					.prepareCall("call addNum2(?,?,?)");
			cstmt.setInt(1, 33);
			cstmt.setInt(2, 17);
			
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.execute();
			System.out.println(cstmt.getInt(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

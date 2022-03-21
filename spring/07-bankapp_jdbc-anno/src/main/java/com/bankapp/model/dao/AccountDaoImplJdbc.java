package com.bankapp.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository(value = "accountDaojdbc")
@Primary
public class AccountDaoImplJdbc implements AccountDao {

	private DataSource dataSource;

	@Autowired
	public AccountDaoImplJdbc(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Account> getAll() {
		Account tempAccount = null;
		List<Account> accounts = new ArrayList<Account>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement pstmt = connection.prepareStatement("select * from accounts");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				tempAccount = new Account(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				accounts.add(tempAccount);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return accounts;
	}

	@Override
	public void update(Account account) {

	}

	@Override
	public Account getById(int id) {
		return null;
	}

	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

}

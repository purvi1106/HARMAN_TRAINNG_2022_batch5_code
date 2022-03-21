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
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "accountDaojdbc")
@Primary
public class AccountDaoImplJdbc implements AccountDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public AccountDaoImplJdbc(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Account> getAll() {
		return jdbcTemplate.query("select * from accounts", new AccountRowMapper());
	}

	@Override
	public void update(Account account) {
		String sql = "update accounts set balance=? where id=?";
		jdbcTemplate.update(sql, new Object[] { account.getBalance(), account.getId() });
	}

	@Override
	public Account getById(int id) {
		return jdbcTemplate.queryForObject("select * from accounts where id=?", new AccountRowMapper(), id);
	}

	@Override
	public void deleteAccount(int id) {
		String sql = "delete from accounts where id=?";
		jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public void addAccount(Account account) {
		String sql = "insert into accounts(name,balance) values(?,?)";
		jdbcTemplate.update(sql, new Object[] { account.getName(), account.getBalance() });
	}
}

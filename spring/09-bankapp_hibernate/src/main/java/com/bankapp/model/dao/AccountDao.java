package com.bankapp.model.dao;
import java.util.*;
public interface AccountDao {
	public List<Account> getAll();;
	public void deleteAccount(int id);
	public void addAccount(Account account);
	public void update(Account account);
	public Account getById(int id);
}

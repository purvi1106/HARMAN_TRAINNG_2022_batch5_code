package com.bankapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.dao.Account;
import com.bankapp.model.dao.AccountDao;
/*
 * <bean id="accountService" class="com.bankapp.model.service.AccountServiceImpl">
		<constructor-arg index="0" ref="accountDao"/>
		<property name="smsService" ref="smsService"></property>
	</bean>
 */
@Transactional
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	private SendSmsService smsService;

	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Autowired
	public void setSmsService(SendSmsService smsService) {
		this.smsService = smsService;
	}

	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		return accountDao.getById(id);
	}

	@Override
	public void transfer(int fromAccId, int toAccId, double amount) {
		Account fromAcc = getById(fromAccId);
		Account toAcc = getById(toAccId);

		fromAcc.setBalance(fromAcc.getBalance() - amount);
		toAcc.setBalance(toAcc.getBalance() + amount);

		accountDao.update(fromAcc);
		
		int a=8/0;
		
		accountDao.update(toAcc);
		if(smsService!=null) {
			System.out.println("sms is send to ur mobile no");
		}
		System.out.println("fund is transfered");
	}

	@Override
	public void deposit(int accNo, double amount) {
		Account acc = getById(accNo);
		acc.setBalance(acc.getBalance() + amount);
		accountDao.update(acc);
	}

	@Override
	public void withdraw(int accNo, double amount) {
		Account acc = getById(accNo);
		acc.setBalance(acc.getBalance() - amount);
		accountDao.update(acc);
	}

}

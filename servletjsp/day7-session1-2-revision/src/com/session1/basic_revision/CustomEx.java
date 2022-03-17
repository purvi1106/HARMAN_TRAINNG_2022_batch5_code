package com.session1.basic_revision;
//---Account---deposit: 15L / withdraw: min balance 10K
//checked ex vs un cheked ex

class AccountCreationException extends Exception{
	
	public AccountCreationException(String message) {
		super(message);
	}
}
class Account{
	private int id;
	private String name;
	private double balance;
	
	public Account(int id, String name, double balance)throws AccountCreationException{
		this.id = id;
		this.name = name;
		this.balance = balance;
		
		if(balance <10000) {
			throw new AccountCreationException("account can not be created due to insufficient fund");
		}
	}

	//NotSufficientFundException
	
	public void withdraw(double amount) {
		balance=balance-amount;
	}
	
	//OverFundException
	public void deposit(double amount) {
		balance=balance+ amount;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}


public class CustomEx {
	
	public static void main(String[] args) {
		
		Account account;
		try {
			account = new Account(1, "raj", -500);
			System.out.println(account);
			
		} catch (AccountCreationException e) {
			System.out.println(e.getMessage());
		}
	
	}

}

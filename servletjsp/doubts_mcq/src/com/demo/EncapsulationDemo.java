package com.demo;

//encapsulation : data hiding
class Account {
	private int id;
	private String name;
	private double balance;

	// BL: id and names once created can not be change: ctr

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// mutator
	public void setBalance(double balance) {
		if (balance <= 0)
			System.out.println("-ve balacne is not possible");
		else
			this.balance = balance;
	}

	// accessor
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}

public class EncapsulationDemo {
	private static Account account=new Account(2, "foo", 890000);
	
	public static void main(String[] args) {
		System.out.println(account);
	}

	
}

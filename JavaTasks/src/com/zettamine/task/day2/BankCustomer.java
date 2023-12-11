package com.zettamine.task.day2;

public class BankCustomer {
	
	private String name;
	private int accountNo;
	private double balance;
	
	
	public BankCustomer() {
		super();
	}

	public BankCustomer(String name, int accountNo, double balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	

	

}

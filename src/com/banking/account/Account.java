package com.banking.account;

public class Account {

	private String name;
	private long accountNo;
	private double bal=0.0;
	
	public Account(String name, long accountNo) {
		this.name = name;
		this.accountNo = accountNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
}

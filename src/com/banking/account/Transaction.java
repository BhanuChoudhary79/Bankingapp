package com.banking.account;

public class Transaction {

	public void deposit(double amt, Account a1) {
		if(amt >= 0) {
			a1.setBal(a1.getBal()+amt);
			System.out.println("Amount deposited successfully");
		}else {
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amt, Account a1) {
		if(amt >= 0 && (a1.getBal()-amt) >=0) {
			a1.setBal(a1.getBal()-amt);
			System.out.println("Withdrawal successful");
		}else {
			System.out.println("Insufficient balance");
		}
	}
	public void currantBal(Account a1) {
		System.out.println("Account holder name: "+a1.getName()+"\nCurrent Balance: "+a1.getBal());
	}
}

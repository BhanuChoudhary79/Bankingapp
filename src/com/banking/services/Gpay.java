package com.banking.services;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;

public class Gpay implements BankUser {

	Transaction t1;
	Account a1;

	public Gpay(Transaction t1, Account a1) {
		this.t1 = t1;
		this.a1 = a1;
	}

	@Override
	public void transfer() {
		Scanner sc = new Scanner(System.in);
		while(true) {	
			System.out.println("Welcome to Gpay\nPress 1 to Receive\nPress 2 to Send\nPress 3 to Check balance");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("Enter the amount you want to deposit: ");
				double amt = sc.nextDouble();
				t1.deposit(amt, a1);
			}else if(choice == 2) {
				System.out.print("Enter the amount you want to withdraw: ");
				double amt = sc.nextDouble();
				t1.withdraw(amt, a1);
			}else if(choice == 3) {
				t1.currantBal(a1);
			}else {
				System.out.println("Invalid choice");
				break;
			}
		}
		sc.close();
	}

}

package com.banking.services;

import java.util.Scanner;
import com.banking.account.*;

public class ATM implements BankUser {

	Transaction t1;
	Account a1;
	
	public ATM(Transaction t1, Account a1) {
		this.t1 = t1;
		this.a1 = a1;
	}

	@Override
	public void transfer() {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Welcome to ATM\nPress 1 to deposit\nPress 2 to withdraw\nPress 3 to Check balance\nPress any other no to exit");
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
				System.out.println("Thank you!");
				break;
			}
		}
		sc.close();
	}

}

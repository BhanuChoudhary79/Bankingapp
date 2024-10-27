package com.banking.account;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account("Bhanu", 1158877);
		Transaction t1 = new Transaction();
		while(true) {
			System.out.println("Press 1 to Deposit money\nPress 2 to withdraw money\nPress 3 to check balance\nPress any other number to exit");
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
				System.out.println("Thank You!");
				break;
			}
		}
		sc.close();
	}
}

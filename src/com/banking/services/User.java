package com.banking.services;

import java.util.Scanner;
import com.banking.account.*;

public class User {

	String userid;
	String pw;
	Scanner sc = new Scanner(System.in);
	
	public void signup() {
		System.out.println("Enter User ID");
		String uid = sc.nextLine();
		System.out.println("Enter Password");
		String pass = sc.nextLine();
		this.userid = uid;
		this.pw = pass;
		System.out.println("Signup succesful");
	}
	public BankUser login(Transaction t1, Account a1) {
		System.out.println("Enter User ID");
		String uid = sc.nextLine();
		System.out.println("Enter Password");
		String pass = sc.nextLine();
		if(this.userid.equals(uid) && this.pw.equals(pass)) {
			System.out.println("Login Successful");
			System.out.println("Press 1 for ATM\nPress 2 for Phonepay\nPress 3 for Gpay");
			int choice = sc.nextInt();
			if(choice == 1) {
				BankUser b1 = new ATM(t1,a1);
				return b1;
			}else if(choice == 2) {
				BankUser b1 = new Phonepe(t1,a1);
				return b1;
			}else if(choice == 3) {
				BankUser  b1 = new Gpay(t1,a1);
				return b1;
			}else {
				System.out.println("Invalid choice");
				return null;
			}
		}else {
			System.out.println("Invalid credentials");
			return null;
		}
	}
}

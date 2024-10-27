package com.banking.services;

import com.banking.account.*;

public class Execute {

	public static void main(String[] args) {

		Account a1 = new Account("Jatin",56675634L);
		Transaction t1 = new Transaction();
		User u1 = new User();
		u1.signup();
		BankUser b1 = u1.login(t1,a1);
		if(b1 != null) {			
			b1.transfer();
		}
	}
}

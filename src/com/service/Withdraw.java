package com.service;
import com.account.Account;
public class Withdraw {
	double amount;
	Withdraw (double amount){
		Account ac=new Account();
		if (amount<=ac.getBalance() && amount>0) {
			double updtbal=ac.getBalance()+amount;
			ac.setBalance(updtbal);
			System.out.println("amount Deposited! currentbalance="+updtbal);
		}
		
	}

}

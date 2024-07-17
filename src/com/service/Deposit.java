package com.service;
import com.account.Account;
public class Deposit {
double amount;
Deposit(double amount){
	Account ac = new Account();
	if(amount>0) {
		double updbal=ac.getBalance ()+amount;
		System.out.println("amount Deposited! currentbalance="+updbal);
	
	}
	else System.out.println("Transaction failed!");
}
}

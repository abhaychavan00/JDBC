package com.account;
public class Account {
private int acc = 345678;
private String name ="ram";
private static double balance = 10000;
 public int getAccount() {
	 return acc;
 }
public void setAccount(int account) {
	this.acc = acc;
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
public String toString() {
	return "Account [account=" + acc + "name="+ name + "balance= " + balance+"]";
}
}

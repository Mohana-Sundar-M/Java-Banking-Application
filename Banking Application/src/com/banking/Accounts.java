package com.banking;

public class Accounts {
	double balance;
	
	//function to deposit amount
	void deposit(double amount){
		if(amount!=0) {
			balance = balance+amount;
			System.out.println("Amount Deposited Successfully");
			System.out.println();
		}else {
			System.out.println("Enter the Valid Amount");
			System.out.println();
			
		}
	}
	
	//function to withdraw  amount
	void withdraw(double amount) {
		if(amount<=balance) {
			balance = balance-amount;
			System.out.println("Withdrawn Successfully");
			System.out.println();
		}else {
			System.out.println("Insufficient Balance ("+balance+")");
			System.out.println();
		}
	}
	
	//function to get the balance
	double getBalance() {
		return balance;
	}

}

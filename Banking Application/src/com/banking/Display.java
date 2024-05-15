package com.banking;

public class Display {
	//declaration
	String user;
	int accountNumber;
	
	//Constructor to getting the user details
	Display(Users userDetail) {
		user = userDetail.getUserName();
		accountNumber = userDetail.getAccountNumber();
	}
	
	//function to display the application
	public void display() {
		System.out.println("User : "+user);
		System.out.println("Account Num : "+accountNumber);
		System.out.println("--------------------------");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println();
	}
}

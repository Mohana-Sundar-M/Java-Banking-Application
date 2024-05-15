package com.banking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingSystem {
	//function to start the application
	public void start() {
		
		//declaration
		int option;
		boolean flag=true;
		double depositAmount,withdrawAmount;
		
		//Scanner Object
		Scanner scan = new Scanner(System.in);
		
		//Welcome Message
		System.out.println("Simple Banking Application");
		System.out.println("--------------------------");
		System.out.println();
		
		//creating user 
		Users user = new Users();
		user.setUserName("User1");
		user.setAccountNumber(505);
		
		//Object creation for display 
		Display displayObj = new Display(user);
		
		//Object creation for account operations
		Accounts account = new Accounts();
		
		while(flag) {//loop to execute the application 
			
			displayObj.display();//displaying the contents
			
			try {
			//Getting the user choice
			System.out.println("Enter The Choice (1-4)");
			option = scan.nextInt();
			
			//validating the choice
			switch(option) {
			
			case 1://check balance
				System.out.println("The Balance is");
				System.out.println(account.getBalance());
				System.out.println();
				break;
				
			case 2://deposit
				System.out.println("Enter the Amount To Deposit");
				
					depositAmount = scan.nextDouble();
					account.deposit(depositAmount);
				
				
				break;
				
			case 3://withdraw
				System.out.println("Enter the Amount To Withdraw");
				withdrawAmount = scan.nextDouble();
				account.withdraw(withdrawAmount);
				break;
				
			case 4://Exit
				System.out.println("You are Exited");
				flag=false;
				break;
				
			default://other option
				System.out.println("Invalid option");
			
				}
			
			}
			catch(InputMismatchException e) {
				System.out.println("Error Occured Try Again With Correct Inputs");
				System.out.println();
				scan.nextLine();//Clear the input buffer
			}
		}
				
	}
}

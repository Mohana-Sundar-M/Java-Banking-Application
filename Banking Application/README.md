# Simple Java Banking Application

## Overview
This is a simple banking application developed in Java. The application allows users to deposit and withdraw money, and check their account balance and exit. The project demonstrates the basic principles of object-oriented programming (OOP) and serves as a foundational example for beginners.

## Features
- Deposit money into an account
- Withdraw money from an account
- Check account balance

## Architecture
The application follows a simple layered architecture:

1. **Model Layer**: Contains the core business logic and data structures.
    - `Users.java`: Represents a bank user with properties like user name and account number.
    - `Accounts.java`: Manages account balance and provides methods for depositing and withdrawing money.

2. **Service Layer**: Contains the services that handle the business logic.
    - `BankingSystem.java`: Provides the main application logic, handling user interactions and coordinating between the view and model layers.

3. **View Layer**: Provides the user interface.
    - `Display.java`: Manages the display of information to the user.
    - `Main.java`: The entry point of the application that initiates the `BankingSystem`.

### Main.java
The `Main.java` file is the entry point of the application. It creates an instance of the `BankingSystem` class and starts the application.

```java
package com.banking;

public class Main {
    public static void main(String[] args) {
        // Object for BankingSystem
        BankingSystem bankApp = new BankingSystem();
        bankApp.start(); // Starting the application
    }
}
```

## Usage
After running the application, you will be prompted with a menu to choose from the following options:

Check balance
Deposit money
Withdraw money
Exit
Follow the on-screen instructions to perform the desired operations.

## Example
```
Simple Banking Application
--------------------------

User : User1
Account Num : 505
--------------------------
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter The Choice (1-4)
2
Enter the Amount To Deposit
5000
Amount Deposited Successfully

User : User1
Account Num : 505
--------------------------
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter The Choice (1-4)
3
Enter the Amount To Withdraw
2580
Withdrawn Successfully

User : User1
Account Num : 505
--------------------------
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter The Choice (1-4)
1
The Balance is
2420.0

User : User1
Account Num : 505
--------------------------
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter The Choice (1-4)
4
You are Exited
```
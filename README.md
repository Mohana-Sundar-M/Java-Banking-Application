# Simple Banking Application

This is a basic command-line banking application implemented in Java. It allows users to check their balance, deposit money, withdraw money, and exit the application.

## Table of Contents

- [Workflow](#Workflow)
- [Features](#Features)
- [Requirements](#Requirements)
- [Installation](#Installation)
- [Usage](#Usage)
- [Example](#Example)
- [Contributing](#Contributing)
- [License](#License)

## Workflow

1. **Welcome Message**: Upon starting the application, users are greeted with a welcome message and presented with options to interact with the banking system.

2. **Display Options**: Users can choose from the following options:
   - Check Balance: View the current balance of their account.
   - Deposit: Add money to their account.
   - Withdraw: Withdraw money from their account.
   - Exit: Close the application.

3. **User Input**: Users select an option by entering the corresponding number.

4. **Perform Actions**: Depending on the chosen option, the application either displays the balance, prompts the user to enter the deposit/withdrawal amount, or exits.

5. **Error Handling**: The application handles various errors gracefully, including invalid input types (e.g., alphabets instead of numbers) and insufficient balance for withdrawal.

## Features

- Check account balance
- Deposit funds into the account
- Withdraw funds from the account
- Error handling for invalid input and insufficient balance
- Simple and intuitive command-line interface
- Easily extensible for additional features

## Requirements

- Java Development Kit (JDK) installed on your machine

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/banking-application.git
    ```
2. **Navigate to the project directory:**
    ```
  cd Banking Application/src/com/banking
  ```
## Usage

1. **Compile the code:**
   Before running the application, you need to compile the Java source code. Open your terminal or command prompt, navigate to the project directory, and run the following command:
   ```bash
   javac Main.java
   ```
   This command compiles the Main.java file and generates the corresponding .class files.

2. **Run the application:**
  Once the code is compiled successfully, you can run the application by executing the following command:
  ```bash
  java Main
  ```
This command starts the banking application and displays the welcome message along with the available options.

Interact with the application:
Follow the on-screen instructions to interact with the banking system. You can choose from the following options:

Check Balance: View the current balance of your account.
Deposit: Add money to your account.
Withdraw: Withdraw money from your account.
Exit: Close the application.
Check Balance:
To check your account balance, select the "Check Balance" option. The application will display your current balance.

Deposit Funds:
To deposit funds into your account, select the "Deposit" option and enter the amount you want to deposit when prompted. The deposited amount will be added to your account balance.

Withdraw Funds:
To withdraw funds from your account, select the "Withdraw" option and enter the amount you want to withdraw when prompted. Make sure you have sufficient balance in your account to complete the withdrawal.

Exit the Application:
To exit the application, select the "Exit" option when prompted. This will close the application and end the session.

Error Handling:
The application handles various errors gracefully, including invalid input types (e.g., alphabets instead of numbers) and insufficient balance for withdrawal. If an error occurs, the application will display an appropriate error message and prompt you to retry the operation.

Enjoy Banking!
That's it! You can now enjoy using the simple banking application to manage your account transactions efficiently.

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

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

Fork the repository
Create a new branch (git checkout -b feature)
Make your changes
Commit your changes (git commit -am 'Add feature')
Push to the branch (git push origin feature)
Create a new Pull Request

## Contact Us
If you have any questions, suggestions, or feedback, feel free to contact us at mohanasundar717@gmail.com

## License
This project is open source so anyone can use this source code for free there is no need for any licence

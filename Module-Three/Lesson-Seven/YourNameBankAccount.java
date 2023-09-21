/**
 * File: YourNameBankAccount.java
 * Author: Ryan Huang
 * Date: 9.21.23
 * Description: This class defines a simple bank account with basic deposit and withdrawal functionalities.
 */

public class YourNameBankAccount {
    // State variables
    double balance;
    String name;

    // Constructor
    public YourNameBankAccount(double initialBalance, String ownerName) {
        this.balance = initialBalance;
        this.name = ownerName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        this.balance -= amount;
    }
}

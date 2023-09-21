/**
 * File: BankAccountTester.java
 * Author: Ryan Huang
 * Date: 9.21.23
 * Description: This class serves as a tester for the YourNameBankAccount class, demonstrating deposit and withdrawal operations.
 */

public class BankAccountTester {
    public static void main(String[] args) {
        // Create a new BankAccount object with $1000 initial balance and owner name "Sally Jones"
        YourNameBankAccount myAccount = new YourNameBankAccount(1000, "Sally Jones");

        // Deposit $505.22 into the account
        myAccount.deposit(505.22);

        // Display the balance
        System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);

        // Withdraw $100 from the account
        myAccount.withdraw(100);

        // Display the remaining balance
        System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);
    }
}
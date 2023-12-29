import java.util.Scanner;

// Class representing a simple banking system
public class SimpleBanking {
    // Member variables representing the balances in savings and checking accounts
    private double savingsBalance;
    private double checkingBalance;

    // Constructor to initialize the banking system with starting balances
    public SimpleBanking(double savingsBalance, double checkingBalance) {
        this.savingsBalance = savingsBalance;
        this.checkingBalance = checkingBalance;
    }

    // Method to deposit amount into savings account
    public void depositSavings(double amount) {
        savingsBalance += amount;
    }

    // Method to deposit amount into checking account
    public void depositChecking(double amount) {
        checkingBalance += amount;
    }

    // Method to withdraw amount from savings account, checks for sufficient balance
    public void withdrawalSavings(double amount) {
        if (amount <= savingsBalance) {
            savingsBalance -= amount;
        } else {
            System.out.println("Insufficient funds in savings.");
        }
    }

    // Method to withdraw amount from checking account, checks for sufficient balance
    public void withdrawalChecking(double amount) {
        if (amount <= checkingBalance) {
            checkingBalance -= amount;
        } else {
            System.out.println("Insufficient funds in checking.");
        }
    }

    // Method to transfer amount from savings to checking account, checks for sufficient balance
    public void transferSavingsToChecking(double amount) {
        if (amount <= savingsBalance) {
            savingsBalance -= amount;
            checkingBalance += amount;
        } else {
            System.out.println("Insufficient funds to transfer from savings to checking.");
        }
    }

    // Method to print the current balances of savings and checking accounts
    public void printBalances() {
        System.out.println("Your total in checking is $" + checkingBalance);
        System.out.println("Your total in savings is $" + savingsBalance);
    }

    // The main method where the program execution begins
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for reading user input
        SimpleBanking bank = new SimpleBanking(3000, 650); // Creating an instance of SimpleBanking
        String anotherTransaction;

        do {
            // Presenting options to the user
            System.out.println("What do you wish to do today?");
            System.out.println("1 for deposit to savings");
            System.out.println("2 for deposit to checking");
            System.out.println("3 for withdraw from savings");
            System.out.println("4 for withdraw from checking");
            System.out.println("5 for transfer funds from savings to checking");
            
            int choice = scanner.nextInt(); // Reading the user's choice
            double amount;

            // Switch case to handle the user's choice
            switch (choice) {
                case 1: // Deposit into savings
                    System.out.println("How much would you like to deposit into savings?");
                    amount = scanner.nextDouble();
                    bank.depositSavings(amount);
                    break;
                case 2: // Deposit into checking
                    System.out.println("How much would you like to deposit into checking?");
                    amount = scanner.nextDouble();
                    bank.depositChecking(amount);
                    break;
                case 3: // Withdraw from savings
                    System.out.println("How much would you like to withdraw from savings?");
                    amount = scanner.nextDouble();
                    bank.withdrawalSavings(amount);
                    break;
                case 4: // Withdraw from checking
                    System.out.println("How much would you like to withdraw from checking?");
                    amount = scanner.nextDouble();
                    bank.withdrawalChecking(amount);
                    break;
                case 5: // Transfer from savings to checking
                    System.out.println("How much do you want to transfer from savings to checking?");
                    amount = scanner.nextDouble();
                    bank.transferSavingsToChecking(amount);
                    break;
                default: // Invalid choice handling
                    System.out.println("Invalid choice.");
                    break;
            }

            // Print the current account balances
            bank.printBalances();

            // Ask if the user wants another transaction
            System.out.println("Would you like another transaction? (Y/N)");
            anotherTransaction = scanner.next();
            
        } while (anotherTransaction.equalsIgnoreCase("Y")); // Continue if user enters 'Y'

        scanner.close(); // Close the scanner object to prevent memory leaks
    }
}

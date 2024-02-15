import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the name to whom the account belongs (\"Exit\" to abort)");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Exit")) break;

            System.out.println("Please enter the amount of the deposit.");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            accounts.add(new BankAccount(name, amount));
        }

        if (accounts.size() > 0) {
            BankAccount largest = accounts.get(0);
            for (BankAccount account : accounts) {
                if (account.getBalance() > largest.getBalance()) {
                    largest = account;
                }
            }

            System.out.println("The account with the largest balance belongs to " + largest.getName() + ".");
            System.out.println("The amount is " + largest.getBalance() + ".");
        } else {
            System.out.println("No accounts were entered.");
        }
    }
}

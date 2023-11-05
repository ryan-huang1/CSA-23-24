import java.util.Scanner;

/**
 * This class calculates how long it will take for a bank account balance
 * to double given a certain interest rate using different compounding periods.
 */
public class CompoundThat {

    /**
     * The main method is the entry point of the program.
     * It handles input and output operations.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Initial balance and interest rate
        System.out.print("Enter account balance: $");
        double initialBalance = scanner.nextDouble();
        
        System.out.print("Enter interest rate (as a decimal): ");
        double interestRate = scanner.nextDouble();
        
        // Output header
        System.out.println("\t\t\t\tYears to Double\t Ending Balance");

        // Calculate for different compounding periods
        double annualBalance = compoundInterest(initialBalance, interestRate, 1);
        double monthlyBalance = compoundInterest(initialBalance, interestRate, 12);
        double dailyBalance = compoundInterest(initialBalance, interestRate, 365);

        scanner.close();
    }

    /**
     * This method computes the compound interest for a given number of periods
     * until the principal has doubled in value.
     *
     */
    private static double compoundInterest(double principal, double rate, int periods) {
        int years = 0;
        double target = principal * 2; // The goal is to double the principal
        
        // Loop until the principal has doubled
        while (principal < target) {
            for (int i = 0; i < periods; i++) {
                double interest = principal * (rate / periods);
                // Rounding the interest every time it's added
                principal += Math.round(interest);
                if (principal >= target) break;
            }
            years++;
        }

        // Output results
        System.out.println("Enter Period: " + periods + "\t\t\t" + years + "\t\t\t$" + String.format("%.2f", principal));
        
        return principal;
    }
    // End of compoundInterest method

}
// End of CompoundThat class

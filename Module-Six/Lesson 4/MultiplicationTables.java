public class MultiplicationTables {
    // Main method - entry point of the Java application
    public static void main(String[] args) {
        // Print the title of the tables
        System.out.println("Tables");

        // Outer loop: Iterates over numbers 1 through 12 for each multiplication table
        for (int i = 1; i <= 12; i++) {
            // Inner loop: Iterates over numbers 1 through 12 for each entry in the current table
            for (int j = 1; j <= 12; j++) {
                // Print the multiplication result in the format "i * j = result"
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            // Print a blank line for better readability, separating each table
            System.out.println();
        }
    }
    // No additional methods or classes are used in this simple program
}

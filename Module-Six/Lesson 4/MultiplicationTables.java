public class MultiplicationTables {
    public static void main(String[] args) {
        System.out.println("Tables");

        for (int i = 1; i <= 12; i++) { // Outer loop for each table
            for (int j = 1; j <= 12; j++) { // Inner loop for each multiplication
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // New line after each table
        }
    }
}

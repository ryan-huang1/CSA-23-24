public class RabbitPopulationCalculator {

    public static int rabbitsAtEndOfMonth(int N) {
        // Base cases
        if (N == 1 || N == 2) {
            return 1;
        } else {
            // Recursive step
            return rabbitsAtEndOfMonth(N - 1) + rabbitsAtEndOfMonth(N - 2);
        }
    }

    public static void main(String[] args) {
        // Change this value to calculate the population for a different month
        int months = 5;

        // Calculate and print the population of rabbits for each month up to the
        // specified month
        for (int i = 1; i <= months; i++) {
            System.out.println("At the end of month " + i + ": There are " + rabbitsAtEndOfMonth(i) + " rabbits");
        }
    }
}

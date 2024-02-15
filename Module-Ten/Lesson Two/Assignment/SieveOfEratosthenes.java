import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1001];
        Arrays.fill(isPrime, true); // Initialize all elements to true.
        isPrime[0] = false; // 0 is not prime.
        isPrime[1] = false; // 1 is not prime.

        // Implement the Sieve of Eratosthenes
        for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime.
                }
            }
        }

        // Print out the prime numbers
        int column = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.printf("%4d ", i); // Print the number right-justified within 4 spaces.
                column++;
                if (column % 15 == 0) {
                    System.out.println(); // Move to the next line after every 15 numbers.
                }
            }
        }
    }
}

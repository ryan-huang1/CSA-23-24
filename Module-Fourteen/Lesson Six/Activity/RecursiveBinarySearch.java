import java.io.*;
import java.util.*;

public class RecursiveBinarySearch {

    // Main method to execute the program
    public static void main(String[] args) throws IOException {
        // Initialize a Scanner to read from a file named "sort.dat"
        Scanner fileScanner = new Scanner(new File("sort.dat"));
        ArrayList<Integer> list = new ArrayList<>();
        // Read integers from the file and add them to an ArrayList
        while (fileScanner.hasNextInt()) {
            list.add(fileScanner.nextInt());
        }
        fileScanner.close(); // Close the file scanner

        // Convert the ArrayList to a primitive int array for binary search
        int[] array = list.stream().mapToInt(i -> i).toArray();

        // Initialize a Scanner to read from standard input
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number to search for (or enter x to exit): ");
            String input = scanner.nextLine();
            if ("x".equalsIgnoreCase(input)) {
                break; // Exit loop if user inputs 'x'
            }

            int number = Integer.parseInt(input); // Convert input to integer
            // Perform binary search and store result
            int result = binarySearch(array, number, 0, array.length - 1);
            // Output results based on the search outcome
            if (result == -1) {
                System.out.println("Your number does not occur in this list");
            } else {
                System.out.println("Your number occurs at position " + (result + 1));
            }
        }
        scanner.close(); // Close the input scanner
    }

    public static int binarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1; // Base condition: target not found in array
        }

        // Calculate the middle index of the current search range
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid; // Target found at mid index
        } else if (array[mid] > target) {
            // Target is less than middle element, search in left half
            return binarySearch(array, target, start, mid - 1);
        } else {
            // Target is greater than middle element, search in right half
            return binarySearch(array, target, mid + 1, end);
        }
    }
}

import java.util.Scanner;
import java.util.Random;

public class SelectionSortTester {
    // Sort the array using the Selection Sort algorithm
    public static void selectionSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int k = j + 1; k < array.length; k++) {
                if (array[k] < array[min]) {
                    min = k;
                }
            }
            // Swap the elements at indices j and min
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
    }

    // Count the number of duplicate elements in the array
    public static int countDuplicates(int[] array) {
        int duplicateCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) { // Since array is sorted, check adjacent elements
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("size of the array --> ");
        int SIZE = scanner.nextInt();
        int[] values = new int[SIZE];
        Random random = new Random();

        // Initialize the array with random integers
        for (int i = 0; i < SIZE; i++) {
            values[i] = random.nextInt(100); // Random integers between 0 and 99
        }

        // First sort
        long startTime = System.currentTimeMillis();
        selectionSort(values);
        long endTime = System.currentTimeMillis();
        System.out.println("Time for first sort: " + (endTime - startTime) + " ms");

        // Second sort (on an already sorted array)
        startTime = System.currentTimeMillis();
        selectionSort(values);
        endTime = System.currentTimeMillis();
        System.out.println("Time for second sort: " + (endTime - startTime) + " ms");

        // Count duplicates
        int duplicates = countDuplicates(values);
        System.out.println("Number of duplicates: " + duplicates);
    }
}

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        // Initialize array
        int[] numbers = { 5, 2, 15, 52, 10 };

        // 1. Sorting an array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // 2. Searching for an element in the array (binary search)
        // Note: The array must be sorted before doing a binary search
        int index = Arrays.binarySearch(numbers, 15);
        System.out.println("The index of element '15' is: " + index);

        // 3. Filling an array with a particular value
        int[] newNumbers = new int[5];
        Arrays.fill(newNumbers, 3);
        System.out.println("Array filled with 3s: " + Arrays.toString(newNumbers));

        // 4. Comparing two arrays for equality
        int[] anotherArray = { 5, 2, 15, 52, 10 };
        Arrays.sort(anotherArray);
        boolean areEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("Are 'numbers' and 'anotherArray' equal? " + areEqual);
    }
}

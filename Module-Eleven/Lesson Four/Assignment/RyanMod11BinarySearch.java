import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchProgram {
    
    public static void main(String[] args) {
        // Attempt to read data from the file and initialize the array
        List<Integer> numbers = readDataFromFile("M11W27L4.dat");
        if (numbers == null) {
            System.out.println("Error reading the data file.");
            return;
        }
        
        // Convert the List to an array for the binary search
        int[] array = numbers.stream().mapToInt(i -> i).toArray();
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to search for: ");
            int target = scanner.nextInt();
            
            int position = binarySearch(array, target);
            
            if (position == -1) {
                System.out.println("Your number does not occur in this list");
            } else {
                // Position is adjusted by 1 for user-friendly output (1-based indexing)
                System.out.println("Your number occurs at position " + (position + 1));
            }
        }
    }
    
    private static List<Integer> readDataFromFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
            return numbers;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (array[mid] == target) {
                return mid; // Found the target
            } else if (array[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        
        return -1; // Target not found
    }
}

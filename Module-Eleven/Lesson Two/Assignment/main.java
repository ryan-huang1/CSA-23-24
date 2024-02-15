import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSortTesterRandom
{
    // Sort the list
    public static void insertionSort(int[] list)
    {
        for (int j = 1; j < list.length; j++)
        {
            int k = j;
            while (k > 0 && list[k-1] > list[k])
            {
                int temp = list[k-1];
                list[k-1] = list[k];
                list[k] = temp;
                k--;
            }
        }
    }

    // Check if the list is sorted
    public static boolean isSorted(int[] list)
    {
        for (int i = 1; i < list.length; i++)
        {
            if (list[i-1] > list[i])
            {
                return false;
            }
        }
        return true;
    }

    // Compute the average of the array values
    public static double computeAverage(int[] list)
    {
        long sum = 0;
        for (int value : list)
        {
            sum += value;
        }
        return sum / (double) list.length;
    }

    // Compute the median of the array values
    public static double computeMedian(int[] list)
    {
        Arrays.sort(list); // Ensure the array is sorted for median calculation
        int middle = list.length / 2;
        if (list.length % 2 == 1)
        {
            // Odd number of elements
            return list[middle];
        }
        else
        {
            // Even number of elements
            return (list[middle-1] + list[middle]) / 2.0;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("size of the array -->");
        int SIZE = scanner.nextInt();
        int[] values = new int[SIZE];
        
        // Initialize array with most elements in the range 0 to 10000
        // and every 10th element in the range 10001 to 100000
        for (int i = 0; i < SIZE; i++)
        {
            if (i % 10 == 0)
            {
                values[i] = 10001 + random.nextInt(90000); // 10001 to 100000
            }
            else
            {
                values[i] = random.nextInt(10001); // 0 to 10000
            }
        }
        
        // Sort the array and measure time
        long startTime = System.currentTimeMillis();
        insertionSort(values);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        // Compute and print average and median
        double average = computeAverage(values);
        double median = computeMedian(values);

        System.out.println("Time taken for sorting: " + duration + " milliseconds");
        System.out.println("Average value: " + average);
        System.out.println("Median value: " + median);
    }
}

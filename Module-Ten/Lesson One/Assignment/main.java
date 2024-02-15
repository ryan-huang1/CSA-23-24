class Exercise5
{
    public static void main (String[] args)
    {
        int[] val = {0, 1, 2, 3}; 
        int temp;

        // Display the original array
        System.out.println("Original Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        // Reverse the order of the numbers in the array using a temporary variable
        for(int i = 0; i < val.length / 2; i++) {
            temp = val[i]; // Use temp to temporarily hold the current element
            val[i] = val[val.length - 1 - i]; // Swap the current element with the corresponding element from the end
            val[val.length - 1 - i] = temp; // Assign the value of temp to the position from the end
        }

        // Display the reversed array
        System.out.println("Reversed Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    }
}

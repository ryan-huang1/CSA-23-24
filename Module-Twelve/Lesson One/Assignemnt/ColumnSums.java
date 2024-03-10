class ColumnSums {
    public static void main(String[] args) {
        int[][] data = {
                { 3, 2, 5 },
                { 1, 4, 4, 8, 13 },
                { 9, 1, 0, 2 },
                { 0, 2, 6, 3, -1, -8 }
        };

        // Step 1: Find the longest row
        int maxLength = 0;
        for (int row = 0; row < data.length; row++) {
            if (data[row].length > maxLength) {
                maxLength = data[row].length;
            }
        }

        // Step 2: Create an array to hold column sums
        int[] columnSums = new int[maxLength];

        // Step 3: Compute the column sums
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                columnSums[col] += data[row][col];
            }
        }

        // Step 4: Print the sums of each column
        for (int col = 0; col < maxLength; col++) {
            System.out.println("Sum of column " + col + ": " + columnSums[col]);
        }
    }
}

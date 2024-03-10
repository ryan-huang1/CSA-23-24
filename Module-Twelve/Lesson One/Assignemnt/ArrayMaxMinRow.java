class ArrayMaxMinRow {

    public static void main(String[] args) {
        int[][] data = {
                { 3, 2, 5 },
                { 1, 4, 4, 8, 13 },
                { 9, 1, 0, 2 },
                { 0, 2, 6, 3, -1, -8 }
        };

        // iterate through each row of the 2D array
        for (int row = 0; row < data.length; row++) {
            // initialize the local max for the current row
            int maxInRow = Integer.MIN_VALUE;

            // iterate through each column of the current row
            for (int col = 0; col < data[row].length; col++) {
                // update maxInRow if the current element is greater
                if (data[row][col] > maxInRow) {
                    maxInRow = data[row][col];
                }
            }

            // print the largest element in the current row
            System.out.println("Largest element in row " + row + " = " + maxInRow);
        }
    }
}

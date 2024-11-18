import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[4][4];

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2); // Generates either 0 or 1
            }
        }

        // Print the matrix
        printMatrix(matrix);

        // Find the largest row and column indices
        int maxRow = findLargestRow(matrix);
        int maxCol = findLargestColumn(matrix);

        // Print the results
        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to find the row with the most 1s
    public static int findLargestRow(int[][] matrix) {
        int maxCount = 0;
        int rowIndex = -1;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }
        return rowIndex;
    }

    // Method to find the column with the most 1s
    public static int findLargestColumn(int[][] matrix) {
        int maxCount = 0;
        int colIndex = -1;
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                colIndex = j;
            }
        }
        return colIndex;
    }
}
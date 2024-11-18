import java.util.Random;

public class Task14 {

    public static void shuffleRows(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            int randomIndex = rand.nextInt(matrix.length);
            swap(matrix, i, randomIndex);
        }
    }

    private static void swap(int[][] matrix, int i, int j) {
        int[] temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Original Matrix:");
        printMatrix(m);

        shuffleRows(m);
        System.out.println("\nShuffled Matrix:");
        printMatrix(m);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
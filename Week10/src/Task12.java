import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");

        // Read the matrix from user input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Display the sum of each column
        for (int j = 0; j < matrix[0].length; j++) {
            double sum = sumColumn(matrix, j);
            System.out.printf("Sum of the elements at column %d is %.1f\n", j, sum);
        }
    }


    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }
}
public class Task8 {

    public static void main(String[] args) {
        int[][] matrix = getArray();
        int sum = sum(matrix);
        System.out.println("Sum of all elements: " + sum);
    }

    public static int[][] getArray() {
        return new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    public static int sum(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }
}
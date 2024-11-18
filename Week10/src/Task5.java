public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        //将0-19的随机数存入
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 20);
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("The sum is : "+sum);
    }
}

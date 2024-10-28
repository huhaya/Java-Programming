import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        double minNumber = min(numbers);
        System.out.println("The minimum number is " + minNumber);
    }

    public static double min(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

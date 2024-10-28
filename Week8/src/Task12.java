import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();

        double[] numbers = new double[numberOfItems];

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numberOfItems; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numberOfItems;

        int countAboveAverage = 0;
        for (double num : numbers) {
            if (num > average) {
                countAboveAverage++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + countAboveAverage);

        scanner.close();
    }
}

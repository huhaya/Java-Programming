import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer:");
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Enter first integer:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second integer:");
        int b = sc.nextInt();
        System.out.println("The greatest common divisor for "+a+" and "+b+" is "+gcd(a,b));
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

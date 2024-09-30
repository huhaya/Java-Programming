package lecture3;

import java.util.Scanner;

public class Lab2Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = in.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Tax: " + String.format("%.2f", tax));
    }
}

package lecture3;

import java.util.Scanner;

public class Lab2Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the subtotal and the gratuity rate: ");
        double subtotal = in.nextDouble();
        double gratuityRate = (in.nextDouble())/100;
        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity+"\nThe total is " + total);
    }
}

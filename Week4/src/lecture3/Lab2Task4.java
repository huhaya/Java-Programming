package lecture3;

import java.util.Scanner;

public class Lab2Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius\n" +
                "and length of a cylinder: ");
        double radius = in.nextDouble();
        double length = in.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = length *area;
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
    }
}

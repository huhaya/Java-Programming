package Lecture1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius:");
        double radius = input.nextDouble();
        double area = 3.14159 * radius * radius;
        System.out.println("The area for the circle of radius" + radius + " is " + area);
    }
}

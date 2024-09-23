package Lecture1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double Celcius = 5.0 / (Fahrenheit - 32.0) * 9.0;
        System.out.println("Fahrenheit " + Fahrenheit + " is " + Celcius + " in Celcius");
    }
}

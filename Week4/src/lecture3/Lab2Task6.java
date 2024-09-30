package lecture3;

import java.util.Scanner;

public class Lab2Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a weight in pounds: ");
        double pounds = in.nextDouble();
        System.out.print("Enter a height in inches: ");
        double inches = in.nextDouble();
        double weightInKilograms = pounds * 0.45359237;
        double heightInMeters = inches * 0.0254;
        double BMI = weightInKilograms / (heightInMeters*heightInMeters);
        System.out.println("BMI is " + BMI);
    }
}

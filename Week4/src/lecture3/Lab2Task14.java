package lecture3;

import java.util.Scanner;

public class Lab2Task14 {
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
        if(BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI<23.9) {
            System.out.println("Normal");
        }
        else if (BMI<27.9) {
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}

package lecture3;

import java.util.Scanner;

public class Lab2Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter th driving distance: ");
        double drivingDistance = (in.nextDouble())/650;
        System.out.println("Enter miles per gallon:" );
        double milesPerGallon = in.nextDouble();
        System.out.println("Enter price per gallon:" );
        double pricePerGallon = in.nextDouble();
        double cost = drivingDistance * milesPerGallon * pricePerGallon;
        System.out.println("The cost of driving is "+cost);
    }
}

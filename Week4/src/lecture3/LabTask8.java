package lecture3;

import java.util.Scanner;

public class LabTask8 {
    public static void main(String[] args) {
        System.out.println("Enter length of the side of a hexagon");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double area = 3*Math.sqrt(3)/2*length * length;
        System.out.println("The area of the hexagon is " + area);

    }
}

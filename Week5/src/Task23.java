import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center of the pentagon to a vertex: ");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5); // Calculate side length

        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5)); // Calculate area
        area = Math.round(area * 100.0) / 100.0; // Round up to two digits after the decimal point

        System.out.printf("The area of the pentagon is %.2f%n", area);
    }
}

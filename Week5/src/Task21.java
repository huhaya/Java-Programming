import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the angle:");
        double angle = input.nextDouble();

        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        System.out.printf("%.2f %-10.4f %-10.4f %-10.4f %-10.4f%n", angle, radians, sine, cosine, tangent);
    }
}

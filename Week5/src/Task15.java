import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first city
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();

        // Prompt the user to enter the second city
        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();

        // Compare the two cities using the compareTo method
        if (city1.compareTo(city2) < 0) {
            // If city1 comes before city2 alphabetically
            System.out.println("The cities in alphabetical order are: " + city1 + ", " + city2);
        } else {
            // If city2 comes before city1 alphabetically or they are equal
            System.out.println("The cities in alphabetical order are: " + city2 + ", " + city1);
        }

        // Close the scanner
        scanner.close();
    }

}

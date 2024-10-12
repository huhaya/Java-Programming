import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = input.nextInt();

        if (decimalValue >= 0 && decimalValue <= 15) {
            char hexValue = '0';
            switch (decimalValue) {
                case 10:
                    hexValue = 'A';
                    break;
                case 11:
                    hexValue = 'B';
                    break;
                case 12:
                    hexValue = 'C';
                    break;
                case 13:
                    hexValue = 'D';
                    break;
                case 14:
                    hexValue = 'E';
                    break;
                case 15:
                    hexValue = 'F';
                    break;
            }

            System.out.println("The hex value is " + (hexValue == '0' ? Integer.toString(decimalValue) : hexValue));
        } else {
            System.out.println(decimalValue + " is an invalid input");
        }
    }
}

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number:");
        String hexNumber = scanner.nextLine();
        int decimalValue = hexToDecimal(hexNumber);
        System.out.println("The decimal value of the hexadecimal number " + hexNumber + " is: " + decimalValue);
    }

    public static int hexToDecimal(String hexNumber) {
        int decimalValue = 0;
        char[] hexChars = hexNumber.toCharArray();
        int power = hexChars.length - 1;
        for (char hexChar : hexChars) {
            int currentValue = Character.digit(hexChar, 16);
            decimalValue += currentValue * Math.pow(16, power);
            power--;
        }
        return decimalValue;
    }
}

package Lecture1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Byte value:");
        byte byteValue = input.nextByte();
        System.out.println("The byte value is: " + byteValue);
        System.out.println("Enter a Short value:");
        short shortValue = input.nextShort();
        System.out.println("The short value is: " + shortValue);
        System.out.println("Enter a float value:");
        float floatValue = input.nextFloat();
        System.out.println("The float value is: " + floatValue);
    }
}

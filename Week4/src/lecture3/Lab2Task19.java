package lecture3;

import java.util.Random;
import java.util.Scanner;

public class Lab2Task19 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);
        System.out.println("number1: " + number1+"and number2 is "+number2);
        System.out.println("What is"+number1+"+"+number2+"?");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (answer == number1+number2) {
            System.out.println("the answer is true");
        }
        else{
            System.out.println("the answer is false");
        }
    }
}

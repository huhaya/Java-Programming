package lecture3;

import java.util.Scanner;

public class Lab2Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        //boolean isLeapYear = (year % 4 == 0) && year % 100 != 0 || year % 400 == 0;
        boolean isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear&&(year % 100 != 0 );
        isLeapYear=isLeapYear||(year % 400 == 0) ;
        if(isLeapYear){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}

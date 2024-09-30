package lecture3;

import java.util.Scanner;

public class Lab2Task3 {
    public static void main(String[] args) {
        int day1 = 2;
        int day2 = 100%7+day1;
        switch(day2) {
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saturday");break;
            case 7:
                System.out.println("Sunday");break;

        }
    }
}

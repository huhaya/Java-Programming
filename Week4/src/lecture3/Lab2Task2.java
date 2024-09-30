package lecture3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab2Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double seconds=sc.nextDouble();
        double minutes=seconds/60;
        double remainingSeconds=seconds%60;
        System.out.println("minutes: "+minutes+" seconds"+" remaining: "+remainingSeconds);
    }
}

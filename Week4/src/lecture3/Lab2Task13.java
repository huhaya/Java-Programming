package lecture3;

import java.util.Scanner;

public class Lab2Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a score");
        int score = in.nextInt();
        System.out.println("Enter the pay");
        int pay = in.nextInt();
        if (score >= 90) {
            System.out.println("You can increase pay by 3%");
            System.out.println("Your pay is: " + pay*(1+0.03));
        }
        else{
            System.out.println("You can decrease pay by 1%");
            System.out.println("Your pay is: " + pay*(1+0.01));
        }
    }
}

package Lecture3;
//PayIncrement
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your pay: ");
        double pay = input.nextDouble();
        System.out.println("Your pay without increment is:"+pay);
        System.out.println("Enter your score:");
        double score = input.nextDouble();
        if(score>90)
        {
            double new_pay=pay+(pay*0.03);
            System.out.println("Your pay with increment is:"+new_pay);
        }
    }
}

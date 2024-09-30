package lecture3;

import java.util.Scanner;

public class LabTask10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a monthly saving amount: ");
        double amount = in.nextDouble();
        double interstRatePerMonth=0.05/12;
        double value=0;
        for(int i=1;i<=6;i++){
            value=(100+value)*(1+interstRatePerMonth);
        }
        System.out.println("After th sixth month,the value in the account becomes."+value);

    }
}

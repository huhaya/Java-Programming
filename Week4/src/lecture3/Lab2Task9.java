package lecture3;

import java.util.Scanner;

public class Lab2Task9 {
    public static void main(String[] args) {
        double savePerMonth=100;
        double interstRatePerMonth=0.05/12;
        double value=0;
        for(int i=0;i<=11;i++){
            value=(100+value)*(1+interstRatePerMonth);
            System.out.println("After "+(i+1)+" month,the value in the account becomes."+value);
        }
    }
}

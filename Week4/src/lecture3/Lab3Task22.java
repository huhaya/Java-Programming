package lecture3;

import java.util.Scanner;

public class Lab3Task22 {
    public static void main(String[] args) {
        int x=1,a=3;
        switch(a){
            case 1: x+=5;
            case 2: x+=10;
            case 3: x+=16;
            case 4: x+=34;
        }
        System.out.println("x="+x);
    }
}

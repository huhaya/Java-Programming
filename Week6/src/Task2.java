import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);

        Scanner input = new Scanner(System.in);

        System.out.println("what is "+number1+" + "+number2+"?");
        int answer=input.nextInt();

        while(number1+number2!=answer){
            System.out.println("Wrong answer. Try again.What is "+number1+" + "+number2+"?");
            answer=input.nextInt();
        }
        System.out.println("You got it!");
    }
}

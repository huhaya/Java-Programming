import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess=-1;
        while(guess!=num){
            System.out.println("Enter your guess:");
            guess=input.nextInt();

            if(guess==num){
                System.out.println("Congratulations! You guessed it!");
            }
            else if(guess<num){
                System.out.println("Your guess is too low");
            }
            else if(guess>num){
                System.out.println("Your guess is too high");
            }
        }
    }
}

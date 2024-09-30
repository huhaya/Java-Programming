package lecture3;

import java.util.Scanner;

public class Lab2Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your lottery pick (two digits): ");
        int userNumber = scanner.nextInt();

        // Ensure the number is treated as a two-digit number
        if (userNumber < 10) {
            userNumber = 0 * 10 + userNumber;
        } else if (userNumber >= 100) {
            userNumber = userNumber % 100; // Remove any extra digit(s)
        }

        // Generate a random lottery number
        int lotteryNumber = (int)(Math.random() * 90) + 10;

        // Compare the user's number with the lottery number
        if (userNumber == lotteryNumber) {
            System.out.println("Exact match: you win $10,000");
        } else if ((userNumber / 10 == lotteryNumber / 10) ||
                (userNumber % 10 == lotteryNumber % 10)) {
            System.out.println("Match all digits: you win $3,000");
        } else if ((userNumber / 10 != lotteryNumber / 10) &&
                (userNumber % 10 != lotteryNumber % 10)) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry: no match");
        }

    }
}

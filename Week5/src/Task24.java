import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine(); // Read entire line as a string

        if (!letter.matches("[a-zA-Z]+")) { // Check if the input contains only letters
            System.out.println(letter + " is an invalid input");
        } else {
            char ch = letter.toLowerCase().charAt(0); // Convert the letter to lowercase and extract the first character
            boolean isVowel = false;

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    isVowel = true;
                    break;
            }

            System.out.println(ch + " is " + (isVowel ? "a vowel" : "a consonant"));
        }
    }
}

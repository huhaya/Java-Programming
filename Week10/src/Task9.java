import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] studentsAnswers = {
                {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}
        };

        String[] correctAnswers = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};

        int[] scores = new int[studentsAnswers.length];

        for (int student = 0; student < studentsAnswers.length; student++) {
            for (int question = 0; question < studentsAnswers[student].length; question++) {
                if (studentsAnswers[student][question].equals(correctAnswers[question])) {
                    scores[student]++;
                }
            }
        }

        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student "+i+"'s scores is :"+ scores[i]);

        }
    }
}
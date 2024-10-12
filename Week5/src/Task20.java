public class Task20 {
    public static void main(String[] args) {
        int number = 1234;
        String language = "Java";
        double value = 5.63;

        // Right-justified output (default)
        System.out.printf("%8d%8s%8.1f\n", number, language, value);

        // Left-justified output
        System.out.printf("%-8d%-8s%-8.1f \n", number, language, value);
    }
}

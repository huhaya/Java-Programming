public class Task19 {
    public static void main(String[] args) {
        printMax(1, 3, 5, 7);

        double[] numbers = {1, 3, 5, 7};
        printMax(numbers);
    }

    public static void printMax(double... values) {
        if (values.length == 0) {
            System.out.println("No values provided.");
            return;
        }

        double max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}

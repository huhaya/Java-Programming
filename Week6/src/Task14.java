public class Task14 {
    public static void main(String[] args) {
        double tuition = 10000;
        double increaseRate = 0.07;
        int year = 0;
        double tuition2 = tuition * 2;

        while (tuition < tuition2) {
            tuition = tuition * (1 + increaseRate);
            year++;
        }

        System.out.println("Tuition will be doubled in " + year + " years");

        System.out.printf("Tuition will be $%.2f in %d years\n", tuition, year);
    }
}

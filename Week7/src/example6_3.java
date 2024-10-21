public class example6_3 {
    public static void main(String[] args) {
        System.out.println("The grade is: "+ printGrade(78.5));
        System.out.println("The grade is: "+ printGrade(59.5));

    }
    private static String printGrade(double v) {
        if(v>=90)
            return "A";
        else if(v>=80)
            return "B";
        else if(v>=70)
            return "C";
        else if(v>=60)
            return "D";
        else
            return "F";
    }
}

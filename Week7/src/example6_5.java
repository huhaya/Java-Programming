public class example6_5 {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;

        System.out.println("The invoking the swap method,num1 is" +
                num1+" and num2 is" +num2);
        swap(num1,num2);
        System.out.println("After invoking the swap method,num1 is"
        +num1+" and num2 is" +num2);
    }
    public static void swap(int num1,int num2) {
        System.out.println("\tInside the swap method");
        System.out.println("\tBefore swapping, num1 is" +num1+" and num2 is" +num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\t\tAfter swapping, num1 is" +num1+" and num2 is" +num2);
    }
}

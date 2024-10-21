public class Task6 {
    public static void main(String[] args) {
        int x=1;
        System.out.println("Before th call, x is "+x);
        increment(x);
        System.out.println("After th call, x is "+x);
    }

    private static void increment(int x) {
        x++;
        System.out.println("n inside the method is "+x);
    }
}

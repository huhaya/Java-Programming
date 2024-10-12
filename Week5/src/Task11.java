public class Task11 {
    public static void main(String[] args) {
        String message="Welcome "+ "to "+" Java ";
        String s1="Chapter "+2;
        String s2=" Supplement "+'B';
        String s3=s1+s2;
        System.out.println("The value of s3 which use '+' is "+s3);
        s3=s1.concat(s2);
        System.out.println("The value of s3 which use concat is "+s3);
    }
}

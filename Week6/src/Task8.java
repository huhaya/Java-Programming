public class Task8 {
    public static void main(String[] args) {
        System.out.println("    Multiplication Table");
        System.out.print("    ");
        for(int j=1;j<=9;j++){
            System.out.print("    "+j);
        }
        System.out.println("\n--------------------------------------");
        for(int j=1;j<=9;j++){
            System.out.print(j+" | ");
            for(int k=1;k<=9;k++){
                System.out.printf("%5d",j*k);
            }
            System.out.println();
        }
    }
}

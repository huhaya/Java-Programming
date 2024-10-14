public class Task10 {
    public static void main(String[] args) {
        int sum=0;
        int number=0;

        while(number<20){
            number++;
            sum+=number;
            if(sum>100){
                break;
            }
        }
        System.out.println("The number is "+number);
        System.out.println("The sum is "+sum);
    }
}
/*
if use break:
The number is 14
The sum is 105

if dont use break:
The number is 20
The sum is 210
 */
public class Task12 {
    public static void main(String[] args) {
        int count = 0;
        int i=2;
        while(count<50){
            if(isPrime(i)){
            System.out.printf("%5d ",i);
                count++;
        }

            if(count%10==0){
                System.out.println();
            }
            i++;
        }
    }
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;

    }
}

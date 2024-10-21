public class example6_6 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumber(50);
    }

    private static void printPrimeNumber(int numberOfPrime) {
        final int NUMBER_OF_PRIMES = 10;
        int count = 0;
        int number = 2;
        while (count <numberOfPrime){
            if(isPrime(number)){
                count++;
                if(count % NUMBER_OF_PRIMES==0){
                    System.out.printf("%-5d",number);
                }
                else{
                    System.out.printf("%-5d",number);
                }
            }
            number ++;
        }
    }

    private static boolean isPrime(int number) {
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }

        }
        return true;
    }
}

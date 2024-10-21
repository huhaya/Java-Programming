public class example6_1 {
    public static void main(String[] args) {
        int i=5;
        int j=2;
        int k=max(i,j);
        System.out.println("The maximum of "+i+" and "+j+" is: "+k);

    }

    private static int max(int i, int j) {
        //return i>j?i:j;
        int result;
        if(i>j){
            result = i;
        }
        else{
            result = j;
        }
        return result;
    }
}

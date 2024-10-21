public class RandomCharacter {
    public static char getRandomCharacter(char ch1,char ch2){
        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomUppererCaseLetter(){
        return getRandomCharacter('A','Z');
    }

        public static void main(String[] args) {
        System.out.println(getRandomLowerCaseLetter());
        System.out.println(getRandomUppererCaseLetter());
    }
}

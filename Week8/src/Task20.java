public class Task20 {
    public static void main(String[] args) {
        int[] list = {1, 4, 8, 5, 9, 7};
        int key = 8;
        int index = linearsearch(list, key);
        System.out.println("The key " + key + " is found at index: " + index);
    }

    public static int linearsearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}

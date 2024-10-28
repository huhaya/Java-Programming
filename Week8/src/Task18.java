public class Task18 {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = reverse(list1);

        System.out.print("List1: ");
        for (int value1 : list1) {
            System.out.print(value1 + " ");
        }

        System.out.println("\nList2: ");
        for (int value2 : list2) {
            System.out.print(value2 + " ");
        }
    }

    public static int[] reverse(int[] original) {
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return reversed;
    }
    
}

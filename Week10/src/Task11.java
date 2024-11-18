import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        Employee[] employees = new Employee[hours.length];
        for (int i = 0; i < hours.length; i++) {
            employees[i] = new Employee(i, calculateTotalHours(hours[i]));
        }

        // 使用自定义排序方法
        customSort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateTotalHours(int[] hours) {
        int totalHours = 0;
        for (int hour : hours) {
            totalHours += hour;
        }
        return totalHours;
    }

    // 自定义排序方法，使用冒泡排序
    private static void customSort(Employee[] employees) {
        int n = employees.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (employees[j].getTotalHours() < employees[j + 1].getTotalHours()) {
                    // 交换位置
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }
}



// Encapsulation example

public class Student {
    // Private fields
    private String name; // 存储学生的名字
    private int age;     // 存储学生的年龄

    // Constructor
    public Student(String name, int age) {
        this.name = name;   // 使用传入的名字初始化name字段
        this.age = age;     // 使用传入的年龄初始化age字段
    }

    // Getter for name
    public String getName() {
        return name;        // 返回名字
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;   // 设置新的名字
    }

    // Getter for age
    public int getAge() {
        return age;         // 返回年龄
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}
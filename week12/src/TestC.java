public class TestC {
    public static void main(String[] args) {
        C object1 = new C();
        //System.out.println(object1.x); // 错误：无法访问私有成员变量 x
        //System.out.println(object1.convert()); // 错误：无法访问私有方法 convert()
    }
}

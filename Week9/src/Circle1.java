public class Circle1 {

    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        System.out.println("The area of the circle of radius " + c1.radius+"is"+c1.getArea());
        Circle1 c2 = new Circle1(25);
        System.out.println("The area of the circle of radius " + c2.radius+"is"+c2.getArea());
        Circle1 c3 = new Circle1(125);
        System.out.println("The area of the circle of radius " + c3.radius+"is"+c3.getArea());
        c2.radius=100;
        System.out.println("The area of the circle of radius " + c2.radius+"is"+c2.getArea());
    }
    double radius;
    Circle1(){
        radius=1;
    }
    Circle1(double r){
        radius=r;
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    void setArea(double r){
        radius=r;
    }
}

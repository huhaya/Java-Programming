public class exercise9_1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("The width and height of rectangle1 are "+rectangle1.width+" and "+rectangle1.height);
        System.out.println("The width and height of rectangle2 are "+rectangle2.width+" and "+rectangle2.height);
        System.out.println("The area of the rectangle1 is "+rectangle1.getArea());
        System.out.println("The area of the rectangle2 is "+rectangle2.getArea());
        System.out.println("The perimeter of the rectangle1 is "+rectangle1.getPerimeter());
        System.out.println("The perimeter of the rectangle2 is "+rectangle2.getPerimeter());
    }
}

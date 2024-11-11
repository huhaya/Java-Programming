public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle() {

    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width + height)*2;
    }
}

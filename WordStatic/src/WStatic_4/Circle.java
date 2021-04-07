package WStatic_4;

public class Circle {
    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPI() {
        return PI;
    }

    public double cirArea(){
        return PI * radius * radius;
    }
    public double cirLenght(){
        return 2 * PI * radius;
    }
}

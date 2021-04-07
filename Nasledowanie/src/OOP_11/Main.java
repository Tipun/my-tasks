package OOP_11;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[6];
        shapes[0] = new Circle("Синий", 1, 2, 2);
        shapes[1] = new Circle("Синий", -1, 2, 3);
        shapes[2] = new Circle("Зеленый",3,3, 2);
        shapes[3] = new Rectangle("Желтый", 1,1, 1,2,2,2,2,1);
        shapes[4] = new Rectangle("Серый", 0,0,0,3,3,3,0,3);
        shapes[5] = new Rectangle("Голубой",1,1,1,4,4,4,4,1);
        Circle[]circles = new Circle[3];
        circles[0] = new Circle("Синий", 1, 2, 2);
        circles[1] = new Circle("Синий", 1, 2, 2);
        circles[2] = new Circle("Зеленый",3,3, 2);
    for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println(circles[0].equals(circles[1]));
    }
}

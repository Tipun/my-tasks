package WStatic_4;

public class Main {
    public static void main(String[] args) {
        Circle cir1 = new Circle(2.5);
        Circle cir2 = new Circle(3);
        Circle cir3 = new Circle(4);

        double s = cir1.cirArea();
        System.out.println(s);
        double l = cir2.cirLenght();
        System.out.println(l);
    }
}

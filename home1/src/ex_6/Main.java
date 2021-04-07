package ex_6;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        double ar = triangle.area();
        double hyp = triangle.hypotenuse();
        double per = triangle.perimetr();

        System.out.printf("Площадь треугольника равна: %.3f\nГипотенуза треугольника равна: %.3f\n" +
                "Периметр треугольника равен: %.3f" ,ar,hyp,per);
    }
}

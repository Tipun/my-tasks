package ex_2;

public class Main {
    public static void main(String[] args) {
        Shape cir = new Circle("синий" ,1,1,2);
        Shape rect = new Rectangle("красный",1,1,1,4,3,4,3,1);
        Shape cir2 = new Circle("синий" ,1,1,3);
        Shape rect2 = new Rectangle("красный",1,1,1,4,3,4,3,1);

        Shape[]shapes = new Shape[4];
        shapes[0] = cir;
        shapes[1] = rect;
        shapes[2] = cir2;
        shapes[3] = rect2;
        for(Shape sh : shapes){
            sh.draw();
        }
        System.out.println(rect.equals(rect2));

    }
}

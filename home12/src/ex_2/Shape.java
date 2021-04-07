package ex_2;

public abstract class Shape {
    String color;
    Shape(String color){
        this.color = color;
    }
    abstract void draw();

    @Override
    public boolean equals(Object obj) {
        Shape p = (Shape) obj;
        return this.color.equals(p.color);
    }
}

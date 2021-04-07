package ex_2;

public class Circle extends Shape{
    int cx ;
    int cy ;
    double radius;
    Circle(String color,int cx,int cy, double radius){
        super(color);
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
    }
    @Override
    void draw() {
        System.out.println("Окружность с центром (" + cx + " , " + cy + ") и радиусом " + radius + "и цветом " + color );
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        return false;
    }
}

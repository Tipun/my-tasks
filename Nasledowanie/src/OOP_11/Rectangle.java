package OOP_11;

public class Rectangle extends Shape {
    private double x1r;
    private double y1r;
    private double x2r;
    private double y2r;
    private double x3r;
    private double y3r;
    private double x4r;
    private double y4r;

    Rectangle(String color, double x1r, double y1r,double x2r, double y2r, double x3r, double y3r,double x4r, double y4r){
        super(color);
        this.x1r = x1r;
        this.y1r = y1r;
        this.x2r = x2r;
        this.y2r = y2r;
        this.x3r = x3r;
        this.y3r = y3r;
        this.x4r = x4r;
        this.y4r = y4r;
    }

    public double getX1r() {
        return x1r;
    }
    public void setX1r(double x1r) {
        this.x1r = x1r;
    }
    public double getY1r() {
        return y1r;
    }
    public void setY1r(double y1r) {
        this.y1r = y1r;
    }
    public void draw(){
        System.out.println("Прямоугольник с координатами\n X1 = " + x1r + " Y1 = " + y1r + "\n X2 = " + x2r + " Y2 = " + y2r + "\n X3 = " + x3r + " Y3 = " + y3r + "\n X4 = " + x4r + " Y4 = " + y4r );
    }
//    public boolean equals (Rectangle obj){
//        if((this.y2r - this.y1r == obj.y2r - obj.y1r) && (this.x3r - this.x2r == obj.x3r - obj.x2r)){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
}

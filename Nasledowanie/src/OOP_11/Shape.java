package OOP_11;

abstract class Shape {
    private String color;
    Shape(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public abstract void draw();
//    public boolean equals (Shape obj){
//        if (this.color == obj.color){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }

}

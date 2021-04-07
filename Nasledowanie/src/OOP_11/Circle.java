package OOP_11;

 class Circle extends Shape {
    private double xc;
    private double yc;
    private double rc;

    Circle(String color, double xc,double yc,double rc){
        super(color);
        this.xc = xc;
        this.yc = yc;
        this.rc = rc;

    }
     public double getXc() {
         return xc;
     }
     public void setXc(double xc) {
         this.xc = xc;
     }
     public double getYc() {
         return yc;
     }
     public void setYc(double yc) {
         this.yc = yc;
     }
     public void draw(){
        System.out.println("Центр окружности в координатах X = " + xc + " Y = " + yc + " радиус = " + rc );
    }
//    public boolean equals (Circle obj){
//        if (this.rc == obj.rc){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
}

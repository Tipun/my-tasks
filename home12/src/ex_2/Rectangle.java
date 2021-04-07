package ex_2;

public class Rectangle extends Shape{
    int ax ;
    int ay ;
    int bx ;
    int by ;
    int cx ;
    int cy ;
    int dx ;
    int dy ;
    Rectangle(String color,int ax,int ay,int bx,int by,int cx,int cy,int dx,int dy){
        super(color);
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.dx = dx;
        this.dy = dy;
    }
    @Override
    void draw() {
        System.out.println("Прямоугольник с углами в точках с (" + ax + " , " + ay + "),(" + bx + " , " + by + "),(" +
                cx + " , " + cy + "),("+ dx + " , " + dy +") и цветом " + color );
    }

    @Override
    public boolean equals(Object obj) {
        Shape p = (Shape) obj;
        return this.color.equals(p.color);

    }
}

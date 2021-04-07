package ex_2;

public class Numbers {
    private int x;
    private int y;

    Numbers(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void getInfo(){
        System.out.println("X = " + x + " Y = " + y);
    }
    public void setChange(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("После изменения " + "X = " + x + " Y = " + y);
    }
    public int sum(){
        return x + y ;
    }
    public int greater(){
        if(x >= y){
            return x;
        }
        else{
            return y;
        }
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

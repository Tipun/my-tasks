package Interface_4;

public abstract class Clothing {
    int size;
    double cost;
    String color;


    public Clothing(int size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void clo ();
}

package WStatic_3;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void printManufakturerInfo(){
        System.out.println("Made in Ukreine");
    }
    public abstract double fruitCost();
}

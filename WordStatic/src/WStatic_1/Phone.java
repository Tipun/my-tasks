package WStatic_1;

public class Phone {
   private int number;
   private String model;
   private double weight;
   private static int count = 0;

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Phone.count = count;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Phone(int number,String model,double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
        count++;
    }

}

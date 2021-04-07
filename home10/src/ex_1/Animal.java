package ex_1;

public class Animal {
    private String food;
    private String location;
    Animal(){

    }
    Animal(String food,String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise() {
        System.out.println("Животное спит");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Храп");
    }



    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

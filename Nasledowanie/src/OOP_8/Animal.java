package OOP_8;

public class Animal {
    private String name;
    private String food;
    private String location;
    Animal(){

    }
    Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getFood(){
        return food;
    }
    public void setFood(String food){
        this.food = food;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Животное по имени " + name + " спит");
    }
    public void eat(){
        System.out.println("Животное ест");
    }
    public void sleep(){
        System.out.println("Животное спит");
    }
}

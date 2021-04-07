package OOP_8;

public class Cat extends Animal{
    private boolean isTray;

    Cat(String name, String food, String location, boolean isTray ){
        super(name,food,location);
        this.isTray = isTray;
    }
    public boolean getIsTray(){
        return isTray;
    }
    public void setIsTray(boolean isTray){
        this.isTray = isTray;
    }
    public void makeNoise(){
        System.out.println("Кошка по имени " + getName() + " спит");
    }
    public void eat(){
        System.out.println("Кошка по имени " + getName() + " ест");
    }

}

package OOP_8;

public class Horse extends Animal{
    boolean isHoof;

    public boolean getIsHoof(){
        return isHoof;
    }
    public void setIsHoof (boolean isHoof){
        this.isHoof = isHoof;
    }
    Horse(String name,String food,String location,boolean isHoof){
        super(name,food,location);
        this.isHoof = isHoof;
    }
    public void makeNoise(){
        System.out.println("Лошадь по имени " + getName() + " спит");
    }
    public void eat(){
        System.out.println("Лошадь по имени " + getName() + " ест");
    }
}

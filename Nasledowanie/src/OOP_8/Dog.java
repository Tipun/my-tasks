package OOP_8;

public class Dog extends Animal {
    boolean muzzle;
    double lengthLeash;

    public Dog(String name, String food, String location, boolean muzzle, double lengthLeash) {
        super(name, food, location);
        this.muzzle = muzzle;
        this.lengthLeash = lengthLeash;
    }

    public boolean isMuzzle() {
        return muzzle;
    }
    public void setMuzzle(boolean muzzle) {
        this.muzzle = muzzle;
    }
    public double getLengthLeash() {
        return lengthLeash;
    }
    public void setLengthLeash(double lengthLeash) {
        this.lengthLeash = lengthLeash;
    }
    public void makeNoise(){
        System.out.println("Собака по имени " + getName() + " спит");
    }
    public void eat(){
        System.out.println("Собака по имени " + getName() + " ест");
    }
}

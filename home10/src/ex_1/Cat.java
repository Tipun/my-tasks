package ex_1;

public class Cat extends Animal{

    private String name;
    private int claw;
    Cat (String food,String location){
        super(food,location);
    }
    @Override
    public void makeNoise() {
        System.out.println(name + " спит.");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClaw() {
        return claw;
    }

    public void setClaw(int claw) {
        this.claw = claw;
    }
}

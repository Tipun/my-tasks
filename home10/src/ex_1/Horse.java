package ex_1;

public class Horse extends Animal{

    private String name;
    private String horseshoes;

    Horse (String food,String location){
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

    public String getHorseshoes() {
        return horseshoes;
    }

    public void setHorseshoes(String horseshoes) {
        this.horseshoes = horseshoes;
    }
}

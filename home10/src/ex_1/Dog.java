package ex_1;

public class Dog extends Animal {
                                  // Почему поля унаследовались, они же private унаследовались ли или?получается да, мы обращаемся
    private String name;          // к полям именно класса дог и кет и енимал через их конструктора
    private boolean watchman;

    Dog (String food,String location){      // почему поля не инициализируются без super
        super(food,location);               // Dog (String food,String location){
    }                                       // this.food = food;
    @Override                               // this.location = locfnion;
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

    public boolean isWatchman() {
        return watchman;
    }

    public void setWatchman(boolean watchman) {
        this.watchman = watchman;
    }
}

package primer;

class Animal {

    String brain;
    String heart;

    public Animal(String brain, String heart) {
        this.brain = brain;
        this.heart = heart;
    }
}


public class Cat extends Animal {

    String tail;

    public Cat(String brain, String heart, String tail) {
        super(brain, heart);
        this.tail = tail;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Мозг", "Сердце", "Хвост");
    }
}

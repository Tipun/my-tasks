package OOP_8;

public class Main {
    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Animal an = new Animal();
//        an.setName("Гена");
//        an.eat();
        an.makeNoise();
        Animal dog = new Dog("Ричард", "мясо","вальер",true,5.3);

        Animal cat = new Cat ("Бяша", "китикет", "чердак", false);

        Animal horse = new Horse("Бони", "сено","стойло",true);
        Animal[]animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = horse;
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }

    }
}

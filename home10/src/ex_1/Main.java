package ex_1;

public class Main {
    public static void main(String[] args) {
        Veterinarian v = new Veterinarian();
        Animal[] animal = new Animal[3];
        Dog dog = new Dog("Кости", "Вальер");
        Cat cat = new Cat("Вискас", "Дом");
        Horse horse = new Horse("Сено", "Стойло");
        animal[0] = dog;
        animal[1] = cat;
        animal[2] = horse;

        for (int i = 0; i < animal.length; i++) {
            v.treatAnimal(animal[i]);
        }
    }
}

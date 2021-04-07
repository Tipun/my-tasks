package OOP_8;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("Имя " + animal.getName() + "\nЕда " + animal.getFood() + "\nМесто " + animal.getLocation());

    }
}

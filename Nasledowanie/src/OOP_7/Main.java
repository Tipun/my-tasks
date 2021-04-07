package OOP_7;

import OOP_7.details.Engine;
import OOP_7.professions.Driver;
import OOP_7.vehicles.Car;
import OOP_7.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {
        Driver dr1 = new Driver("Типун Максим",35,17);
        Engine en1 = new Engine(84,"Хонда");
        Car car1 = new Car("Хонда Джаз","Хэчбэк",1450,dr1,en1);

        Lorry lo1 = new Lorry ("Хонда Джаз","Хэчбэк",1450,dr1,en1,50);
        lo1.printInfo();
    }
}

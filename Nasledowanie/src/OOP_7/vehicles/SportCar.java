package OOP_7.vehicles;

import OOP_7.details.Engine;
import OOP_7.professions.Driver;

public class SportCar extends Car {
    int speed;

    public SportCar(String marka, String carClass, int weight, Driver dr, Engine en, int speed) {
        super(marka, carClass, weight, dr, en);
        this.speed = speed;
    }
}

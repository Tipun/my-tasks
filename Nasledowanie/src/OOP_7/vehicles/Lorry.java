package OOP_7.vehicles;

import OOP_7.details.Engine;
import OOP_7.professions.Driver;

public class Lorry extends Car {
    private int carryng;

    public Lorry(String marka, String carClass, int weight, Driver dr, Engine en, int carryng) {
        super(marka, carClass, weight, dr, en);
        this.carryng = carryng;
    }

    public int getCarryng() {
        return carryng;
    }

    public void setCarryng(int carryng) {
        this.carryng = carryng;
    }
    public void printInfo(){
        System.out.println("Марка автомобиля " + getMarka());
        System.out.println("Класс автомобиля " + getCarClass());
        System.out.println("Вес автомобиля " + getWeight());
        System.out.println("Водитель " + dr.getFullName() + " его возраст " + dr.getAge() + " опыт вождения " + dr.getExperiense());
        System.out.println("Мощность двигателя " + en.getPower() + " его производитель " + en.getCompany());
        System.out.println("Грузоподъемность машины " + getCarryng());
    }
}

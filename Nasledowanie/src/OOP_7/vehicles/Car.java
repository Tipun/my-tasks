package OOP_7.vehicles;

import OOP_7.details.Engine;
import OOP_7.professions.Driver;

public class Car {
     String marka;
     String carClass;
     int weight;
     Driver dr;
     Engine en;

    public Car(String marka, String carClass, int weight, Driver dr, Engine en) {
        this.marka = marka;
        this.carClass = carClass;
        this.weight = weight;
        this.dr = dr;
        this.en = en;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDr() {
        return dr;
    }

    public void setDr(Driver dr) {
        this.dr = dr;
    }

    public Engine getEn() {
        return en;
    }

    public void setEn(Engine en) {
        this.en = en;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void printInfo(){
        System.out.println("Марка автомобиля " + getMarka());
        System.out.println("Класс автомобиля " + getCarClass());
        System.out.println("Вес автомобиля " + getWeight());
        System.out.println("Водитель " + dr.getFullName() + " его возраст " + dr.getAge() + " опыт вождения " + dr.getExperiense());
        System.out.println("Мощность двигателя " + en.getPower() + " его производитель " + en.getCompany());
    }
}

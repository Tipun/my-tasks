package OOP_7.professions;

import OOP_7.Person;

public class Driver extends Person {
    private int experiense;

    public Driver(String fullName, int age, int experiense) {
        super(fullName, age);
        this.experiense = experiense;
    }

    public int getExperiense() {
        return experiense;
    }

    public void setExperiense(int experiense) {
        this.experiense = experiense;
    }
}

package ex_1;

public class Phone {
    int number;
    String model;
    double weigth;

    public void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }

    public int getNumber() {
        return number;
    }
}

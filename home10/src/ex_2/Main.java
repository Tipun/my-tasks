package ex_2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Петров П.П.", 35);
        person1.talk();
        person2.talk();
    }
}

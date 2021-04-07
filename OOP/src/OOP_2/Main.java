package OOP_2;

public class Main {
    public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person("Типун Тамара",58);

        System.out.println("Имя = " + person1.getFullName() + ", возраст = " + person1.getAge());
        System.out.println("Имя = " + person2.getFullName() + ", возраст = " + person2.getAge());
    }
}

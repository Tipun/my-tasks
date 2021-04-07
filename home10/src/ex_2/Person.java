package ex_2;

public class Person {
    private String fullName;
    private int age;
    Person(){
        this.fullName = "Кто-то";
        this.age = 30;
    }
    Person(String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void talk(){
        System.out.println("Person " + fullName + " говорит");
    }
    public void move(){
        System.out.println("Person " + fullName + " говорит");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

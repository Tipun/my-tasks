package OOP_2;

public class Person {
    private String FullName;
    private int age;

    public void setFullName(String FullName){
        this.FullName = FullName;
    }
    public String getFullName (){
        return FullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void move(){
        System.out.println(this.FullName + "говорит");
    }
    Person(){
        this.FullName = "Типун Максим";
        this.age = 35;
    }
    Person(String FullName,int age){
        this.FullName = FullName;
        this.age = age;
    }
}

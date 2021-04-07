package ex_3;

public class Human {
    String name;
    int age;
    boolean isMale;
    int numberOfTel;
    double height;
    double weight;
    Human(String name){
    this.name = name;
    }
    Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    Human(String name,int age,boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    Human(String name,int age,boolean isMale,int numberOfTel){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.numberOfTel = numberOfTel;
    }
    Human(String name,int age,boolean isMale,int numberOfTel,double height){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.numberOfTel = numberOfTel;
        this.height = height;
    }
    Human(String name,int age,boolean isMale,int numberOfTel,double height,double weight){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.numberOfTel = numberOfTel;
        this.height = height;
        this.weight = weight;
    }
    Human(String name,int age,boolean isMale,double height,double weight){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.height = height;
        this.weight = weight;
    }
    Human(String name,int age,double height,double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    Human(double height,double weight){
        this.height = height;
        this.weight = weight;
    }
}

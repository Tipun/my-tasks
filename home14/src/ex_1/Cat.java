package ex_1;

import java.util.ArrayList;

public class Cat {
    String name;
    int age;
    static ArrayList<Cat>cats = new ArrayList<Cat>();
    Cat(String name, int age){
        this.name = name;
        this.age = age;
        cats.add(this);
    }
    public String toString(){
        return "Имя кота : " + name + " Возраст кота : " + age;
    }
    static void printCats(){
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}

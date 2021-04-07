package ex_4;

import java.util.ArrayList;

public class Human {
    String name;
    boolean isMale;
    int age;
    ArrayList <Human> children;

    Human(String name,boolean isMale,int age,ArrayList <Human> children){
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.children = children;
    }
    public String toString(){
        String s = "Имя : " + name + " ,пол м : " + isMale + " ,возраст : " + age;

        if (children != null) {
            for (Human child : children) {
                s = s + "\n ребенок - " + "Имя : " + child.name + " ,пол м : " + child.isMale + " ,возраст : " + child.age;
            }
        }
        return s;
    }

}

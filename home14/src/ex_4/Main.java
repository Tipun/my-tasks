package ex_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Human child1 = new Human("Максим", true,35,null);
        Human child2 = new Human("Александр", true,23,null);
        Human child3 = new Human("Маша", false,21,null);

        ArrayList<Human>children3 = new ArrayList<Human>();
        children3.add(child1);
        children3.add(child2);
        children3.add(child3);
        Human parents1 = new Human("Тамара Ивановна",false,58,children3);
        Human parents2 = new Human("Анатолий Михайлович",true,60,children3);

        ArrayList<Human>children1 = new ArrayList<Human>();
        children1.add(parents1);
        ArrayList<Human>children2 = new ArrayList<Human>();
        children2.add(parents2);

        Human grandfather1 = new Human("Иван Иванович", true,82,children1);
        Human grandmather1 = new Human("Мария Григорьевна", false,80,children1);
        Human grandfather2 = new Human("Михаил Петрович", true,78,children2);
        Human grandmather2 = new Human("Анна Тихоновна", false,77,children2);

        System.out.println("Дедушка1 \n" + grandfather1);
        System.out.println("Бабушка1 \n" + grandmather1);
        System.out.println("Дедушка2 \n" + grandfather2);
        System.out.println("Бабушка2 \n" + grandmather2);
        System.out.println("Отец \n" + parents1);
        System.out.println("Мать \n" + parents2);
        System.out.println("Ребенок \n" + child1);
        System.out.println("Ребенок \n" + child2);
        System.out.println("Ребенок \n" + child3);





    }
}

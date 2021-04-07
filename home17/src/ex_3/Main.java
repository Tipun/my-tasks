package ex_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pat cat1 = new Cat("Кот",2.2,1,15);
        Pat cat2 = new Cat("Кот",2.5,2,18);
        Pat dog1 = new Dog("Собака",13.5,1,25);
        Pat dog2 = new Dog("Собака",15.5,3,26);
        Pat parrot1 = new Parrot("Попугай",0.3,1,12);
        Pat parrot2 = new Parrot("Попугай",0.4,3,14);

        HashMap<String,Pat> pats = new HashMap<>();
        pats.put("Мурзик",cat1);
        pats.put("Бяша",cat2);
        pats.put("Ричард",dog1);
        pats.put("Доги",dog2);
        pats.put("Гоша",parrot1);
        pats.put("Кеша",parrot2);

        Set<String> names = pats.keySet();
        for(String name : names){
            System.out.println(name);
        }
        System.out.println();
        ArrayList<Pat> patsi = new ArrayList<>(pats.values());
        for(Pat pat : patsi){
            System.out.println(pat);
        }
        System.out.println();
        HashSet<Map.Entry<String,Pat>> patsii = new HashSet<>(pats.entrySet());
        for(Map.Entry pat : patsii){
            System.out.println(pat);
        }
    }
}

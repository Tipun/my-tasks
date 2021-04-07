package ex_2;

import java.awt.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Prodact> toy = new HashMap<>();
        toy.put("Кукла", new Prodact("Кукла", 0.45,"желтый"));
        toy.put("Машина", new Prodact("Машина", 0.85,"красный"));
        toy.put("Медведь", new Prodact("Медведь", 1.20,"коричневый"));
        toy.put("Волк", new Prodact("Волк", 1.00,"серый"));
        toy.put("Лиса", new Prodact("Лиса", 0.75,"рыжий"));

        LinkedHashSet<String> names = new LinkedHashSet<>(toy.keySet());
        for(String name : names){
            System.out.println(name);
        }

        ArrayList<Prodact> prodacts = new ArrayList<>(toy.values());
        for(Prodact prodact : prodacts){
            System.out.println(prodact);
        }
        HashSet<Map.Entry<String,Prodact>> toyMap = new HashSet<>(toy.entrySet());
        for(Map.Entry prodact : toyMap){
            System.out.println(prodact);
        }

    }
}

package ex_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,Cat> catMap = createMap();
        Set<String> catSet = getSet(catMap);
        printSet(catSet);
//        for(String name : catSet){
//            System.out.println(name);
//        }

    }
    public static Map createMap(){
        Map<String,Cat> map = new HashMap<>();
        map.put("Мурзик1", new Cat("Мурзик1"));
        map.put("Мурзик2", new Cat("Мурзик2"));
        map.put("Мурзик3", new Cat("Мурзик3"));
        map.put("Мурзик4", new Cat("Мурзик4"));
        map.put("Мурзик5", new Cat("Мурзик5"));
        map.put("Мурзик6", new Cat("Мурзик6"));
        map.put("Мурзик7", new Cat("Мурзик7"));
        map.put("Мурзик8", new Cat("Мурзик8"));
        map.put("Мурзик9", new Cat("Мурзик9"));
        map.put("Мурзик10", new Cat("Мурзик10"));
        return map;
    }
    public static Set getSet(Map<String,Cat> map){
        Set<String> set = new HashSet(map.keySet());
        return set;
    }
    public static void printSet(Set<String> set){
        for( String name : set){
            System.out.println(name);
        }
    }

}

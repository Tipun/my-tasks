package ex_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        String name1 = "Максим";
        String name2 = "Петр";
        String name3 = "Егор";
        String name4 = "Егор";
        String name5 = "Константин";
        String name6 = "Макар";
        String name7 = "Иван";
        String name8 = "Матвей";
        String name9 = "Мирон";
        String name10 = "Иван";
        ArrayList<String> names = new ArrayList<>(Arrays.asList(name1,name2,name3,name4,name5,name6,name7,name8,name9,name10));
        System.out.println(names);
        HashSet bd = bezDublicatov(names);
        System.out.println(bd);
    }
    public static LinkedHashSet bezDublicatov(ArrayList ar){
        LinkedHashSet bd = new LinkedHashSet(ar);
        return bd;
    }
}

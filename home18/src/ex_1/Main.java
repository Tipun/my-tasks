package ex_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String n;
     int a;
        HashMap<String,Integer> list = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        while (true) {
            System.out.println("Введте имя");
            n = scs.nextLine();
            if(n.equals("")){
                break;
            }
            System.out.println("Введите возраст");
            a = sc.nextInt();
            if (!n.equals("")) {
                list.put(n, a);
            }
        }

        HashSet<Map.Entry<String,Integer>> listEntry = new HashSet<>(list.entrySet());
        for(Map.Entry entry : listEntry) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
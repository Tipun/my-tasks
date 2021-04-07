package ex_1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> MyArray = new ArrayList<>();

        String[] wnames = new String[5];
        wnames[0] = "Ирина";
        wnames[1] = "Надежда";
        wnames[2] = "Марина";
        wnames[3] = "Наталья";
        wnames[4] = "Тамара";
        String[] tv = new String[2];
        tv[0] = "LG";
        tv[1] = "SAMSUNG";
        String[]cars = new String[4];
        cars[0] = "Mercedes";
        cars[1] = "Toyota";
        cars[2] = "Honda";
        cars[3] = "Bugatti";
        String[]mnames = new String[7];
        mnames[0] = "Максим";
        mnames[1] = "Петр";
        mnames[2] = "Егор";
        mnames[3] = "Назар";
        mnames[4] = "Сергей";
        mnames[5] = "Вадим";
        mnames[6] = "Георгий";
        String[]pilots = new String[0];
        MyArray.add(wnames);
        MyArray.add(tv);
        MyArray.add(cars);
        MyArray.add(mnames);
        MyArray.add(pilots);

        for(String[] s : MyArray){
            for (int i = 0; i < s.length;i++){
                System.out.print( s[i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(String[] s : MyArray){
            System.out.println(Arrays.toString(s));
        }
    }
}

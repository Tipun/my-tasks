package ex_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(6);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(4);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        Comparator comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a < b) {
                    return 1;
                } else if (a > b) {
                    return -1;
                } else {
                    return 0;
                }
            }
        } ;
        numbers.sort(comp);
        System.out.println(numbers);



    }
}

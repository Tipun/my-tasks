package ex_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        ArrayList<Integer> arrNumber = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            arrNumber.add(numbers[i]) ;
        }
        Collections.sort(arrNumber);
        for (Integer integer : arrNumber) {
            System.out.print(integer + " ");
        }

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(arrNumber.get(i) + " ");
//        }
    }
}

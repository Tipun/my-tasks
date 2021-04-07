package ex_9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[300];
        int start = 0;
        int finish = 0;
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(101);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % arr[1] == 0 ){
                start++;
            }
            if(arr[i] % arr[arr.length - 1] == 0) {
                finish++;
            }
        }
        System.out.println("В массиве больше чисел которые делятся на первый элемент, чем на последний на " +
                (start - finish));
}
}

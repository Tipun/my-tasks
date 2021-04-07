package ex_8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int q = 0;
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(101);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 7 != 0){
                q++;
            }
        }
        System.out.println("Количество чисел равно " + q);
    }
}

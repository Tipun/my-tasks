package ex_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                arr[i] = (i + 1) % 5;
            }
            if(i % 2 != 0){
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

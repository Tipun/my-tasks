package ex_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> arr = new ArrayList<>();
        arr.add(createMas(5));
        arr.add(createMas(2));
        arr.add(createMas(4));
        arr.add(createMas(7));
        arr.add(createMas(3));
        for(int[] r : arr){
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
        for(int[] r : arr){
            printMas(r);
        }
    }
    public static int[] createMas (int n){
        int[]mas = new int[n];
        Random rnd = new Random();
        for(int i = 0; i < mas.length; i++){
            mas[i] =-10 + rnd.nextInt(21);
        }
        return mas;
    }
    public static void printMas (int[]mas){
        for(int i = 0;i< mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}

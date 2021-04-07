package ex_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = - 100 + (int) (Math.random() * 201);
        }
        String str = Arrays.toString(arr);
        System.out.println(str);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double average = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println("Максимальное значение равно " + max);
        System.out.println("Минимальное значение равно " + min);
        System.out.println("Среднн значение равно " + average);
    }
}

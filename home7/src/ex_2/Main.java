package ex_2;

import java.util.Arrays;

public class Main {
    static void print(int []num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
        int tmp;
        for (int i = 0; i < numbers.length -1 ; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if(numbers[j] > numbers[j+1]){
                   tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                   numbers[j+1] = tmp;
                }
            }
        }
        print(numbers);
    }
}

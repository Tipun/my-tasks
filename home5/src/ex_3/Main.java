package ex_3;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        int[]arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1 + (int)(Math.random() * 3);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Введите число от -1 до 1");
        int a;
        do {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if(a < -1 || a > 1) {
                System.out.println("Повторите ввод");
            }
            }while (a < -1|| a > 1);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != a){
                arr[index++] = arr[i];
            }
        }
        int[]arr1 = Arrays.copyOf(arr,index);
        System.out.println(Arrays.toString(arr1));
    }
}

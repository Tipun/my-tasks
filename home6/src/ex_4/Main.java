package ex_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        System.out.println("Это должно быть четное число");
        int n;
        do {
            n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println("Введенное вами число не четное, повторите ввод");
            }
        }while(n % 2 != 0);
        int[]arr = new int[n];
        for (int i = 0; i < arr.length/2; i++) {
            arr[i] =-10 + (int) (Math.random() * 21);
            if (arr[i]==0){
                i--;
            }
            arr[arr.length - (i+1)] = -arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

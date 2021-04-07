package ex_5;

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
        int q2 = 0;
        int q1 = 0;
        int q0 = 0;
        do {
             q2 = 0;
             q1 = 0;
             q0 = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 3);
                if (arr[i] == 0) {
                    q0++;
                }
                if (arr[i] == 1) {
                    q1++;
                }
                if (arr[i] == 2) {
                    q2++;
                }
                if (arr[i] == 1 && q2 == 0) {
                    i--;
                    q2 = 0;
                    q1 = 0;
                    q0 = 0;
                }
            }
        }while(q1 != q2 + q0);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

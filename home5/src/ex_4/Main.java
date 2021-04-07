package ex_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 3 * n; i++) {
            if(i <= n)
                System.out.print("1 ");
            else if(i > n && i <= 2 * n)
                System.out.print("2 ");
            else if(i > 2 * n && i <= 3 * n)
                System.out.print("3 ");

        }
    }
}

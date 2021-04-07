package ex_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        double dollarRate = sc.nextDouble();
        for (int i = 1; i < 101; i++) {
            System.out.println(i + "$ " + i * dollarRate + "p " + i * dollarRate / 20 + "кг");

        }
    }
}

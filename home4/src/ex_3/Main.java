package ex_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Введите число от 1 до 180");
        int c;
        do {
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            if (c < 1 || c > 180) {
                System.out.println("Вы ввели неверное число. Повторите ввод");
            }
        } while (c < 1 || c > 180);

        String s = "";
        for (int i = 10; i < 100; i++) {
            s = s + Integer.toString(i);
        }
        System.out.println(s);
        System.out.println("Цифра под номером " + c + " - " + s.charAt(c-1));
    }
}

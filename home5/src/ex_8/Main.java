package ex_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1 + (int)(Math.random() * 100);
        System.out.println(n);
        boolean win = false;
        System.out.println("Угадайте число от 1 до 100 , у вас три попытки");

        for (int i = 0; i < 3; i++) {
            int answer = sc.nextInt();
            if(answer < n){
                System.out.println("Загаданное число больше");
            }
            else if(answer > n){
                System.out.println("Загаданное число меньше");
            }
            else if (answer == n){
                System.out.println("Вы угадали!!!");
                win = true;
                break;
            }
        }
        if(win == false){
            System.out.println("Попытки исчерпаны, попробуйте еще");
        }

    }
}

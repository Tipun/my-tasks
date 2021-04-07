package ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число");
        int q = 0;
        int number;
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            num = number;

            while (num != 0) {
                num = num / 10;
                q++;
            }
            if(q != 4){
                System.out.println("Число, введенное вами не четырехзначное\n Повторите ввод");
                q = 0;
            }
        }while(q!=4);


        int a;
        num = number;
        for (int i = 0; i < 4; i++) {
           a = num % 10;
           if(a < 5){
               System.out.print(a);
           }
           num = num / 10;
        }
        num = number;
        for (int i = 0; i < 4; i++) {
            a = num % 10;
            if(a >= 5){
                System.out.print(a);
            }
            num = num / 10;
        }


    }
}

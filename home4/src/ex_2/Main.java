package ex_2;

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
        if(number/1000 == number%10 && number/100%10 == number%100/10)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}

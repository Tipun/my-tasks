package ex_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance1 = 10;
        double distance = distance1;
        double sumDist = 10;
        for (int i = 2; i < 11; i++) {
            distance += 0.1 * distance;
            sumDist += distance;
            if(i == 7 ){
                System.out.printf("Пробег за семь дней составил %.3f киломметров",sumDist );
                System.out.println();
            }
            System.out.printf("Пробег за день номер %d составил %.3f киломметров",i,distance );
            System.out.println();
        }
        System.out.println("Введите номер дня бега лыжника");

            Scanner sc = new Scanner(System.in);
            int dayNumber = sc.nextInt();
            int dayNumberX = dayNumber;
            while(dayNumberX > 1){
                distance1 += 0.1 * distance1;
                dayNumberX--;
            }
            System.out.printf("Пробег за день номер %d составил %.3f киломметров",dayNumber,distance1 );
            System.out.println();

                double distance11 = 10;
                int dayNumber1 = 1;
        while(distance11 < 80){
            dayNumber1 ++;
            distance11 += 0.1 * distance11;

        }
        System.out.printf("Следует прекратить увеличивать пробег в день номер %d ,если пробег не должен привышать 80 " +
                " киломметров",dayNumber1 - 1);
    }
}

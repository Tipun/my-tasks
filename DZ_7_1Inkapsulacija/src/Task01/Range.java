package Task01;

import java.util.Scanner;

public class Range {
    public int start;
    public int finish;

    public Range() {
        boolean err;

        do {
            do {
                err = false;
                System.out.println("Введите начало диапазона");
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    start = sc.nextInt();
                } else {
                    System.out.println("Вы ввели не число, поробуйте снова");
                    err = true;
                }
            } while (err);
            do {
                err = false;
                System.out.println("Введите конец диапазона");
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    finish = sc.nextInt();
                } else {
                    System.out.println("Вы ввели не число, поробуйте снова");
                    err = true;
                }
            } while (err);
            if(start > finish){
                System.out.println("Начало диапазона больше чем его конец");
            }
        }while (start > finish );
    }

    int calcRange(){
        int l = finish - start + 1;
        return l;
    }

}

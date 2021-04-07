package onTheLesson2;

import java.util.Scanner;

public class ForNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число № 1");
        int a = sc.nextInt();
        System.out.println("Введите число № 2");
        int b = sc.nextInt();
        System.out.println("Введите число № 3");
        int c = sc.nextInt();
        System.out.println("Введите число № 4");
        int d = sc.nextInt();

        if(a%2 != 0 && b%2 != 0 && c%2 != 0 && d%2 != 0){
            System.out.println("no found");
        }
        else{
            while(Math.max(Math.max(a,b),Math.max(c,d)) % 2 != 0){
                if (Math.max(Math.max(a,b),Math.max(c,d)) == a && a % 2 != 0){
                    a = Integer.MIN_VALUE;
                }
                else if (Math.max(Math.max(a,b),Math.max(c,d)) == b && b % 2 != 0) {
                    b = Integer.MIN_VALUE;
                }
                else if (Math.max(Math.max(a,b),Math.max(c,d)) == c && c % 2 != 0) {
                    c = Integer.MIN_VALUE;
                }
                else if (Math.max(Math.max(a,b),Math.max(c,d)) == d && d % 2 != 0) {
                    d = Integer.MIN_VALUE;
                }
            }
            System.out.println(Math.max(Math.max(a,b),Math.max(c,d)) + " наибольшее четное число");
        }


    }
}



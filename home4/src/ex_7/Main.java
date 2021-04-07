package ex_7;

import java.util.Random;

public class Main {
    static void byRandom(){
        Random rnd = new Random();
        int c = 0;
        int sum = 0;
        while(sum <= 10){
            c = rnd.nextInt(2);
            sum += c;
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        int c = 0;
        int sum = 0;
        while(sum <= 10) {
            c =(int) (Math.random() * 2);
            sum += c;
            System.out.print(c);
        }
        System.out.println();



        byRandom();
    }
}

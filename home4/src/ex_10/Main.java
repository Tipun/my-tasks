package ex_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        long ch = sc.nextLong();
        int q = 0 ;
        String chStr = String.valueOf(ch);
        for (int i = 0; i < chStr.length(); i++) {
            if (((ch % 10) > 3)&& ((ch % 10) < 8)){
                q++;
            }
            ch = ch / 10;
        }
        System.out.println(q);
    }
}

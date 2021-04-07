package ex_3;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() >= 5){
            System.out.println(str.substring(0,3));
            System.out.println(str.substring(str.length()-3));
        }
        else {
            for (int i = 0 ; i < str.length() ; i++) {
                System.out.println(str.charAt(0));
            }
        }
    }
}

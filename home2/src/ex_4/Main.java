package ex_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число №1");
        int a = sc.nextInt();
        System.out.println("Введите число №2");
        int b = sc.nextInt();
        System.out.println("Введите число №3");
        int c = sc.nextInt();
        if(a > 10 && b > 10 && c > 10 && a % 3 == 0 && b % 3 == 0){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

package ex_5;
import java.util.Scanner;
public class ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число №1");
        int a = sc.nextInt();
        System.out.println("Введите число №2");
        int b = sc.nextInt();

        int z = (a != 10 && b != 10 && a % 2 == 0) ? a + b : a * b;
        System.out.println(z);
    }
}

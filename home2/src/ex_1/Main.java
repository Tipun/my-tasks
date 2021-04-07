package ex_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        if((number > 100) || (number < -100)){
            number = 0;
        }
        else{
            number += 1;
        }
        System.out.println(number);
    }
}

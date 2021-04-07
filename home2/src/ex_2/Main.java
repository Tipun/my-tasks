package ex_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        if((number > -10) && (number < 10)){
            number += 5;
        }
        else{
            number -= 10;
        }
        System.out.println(number);
    }
}

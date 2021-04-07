package ex_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >= 2 && number <= 5){
            number += 10;
        }
        else if (number >= 7 && number <= 40){
            number -= 100;
        }
        else if (number <= 0 || number <= 3000){
            number *= 3;
        }
        else{
            number = 0;
        }
        System.out.println(number);
    }
}

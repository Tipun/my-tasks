package ex_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = enterNumber();
        System.out.println(sumNumbers(number));
    }

    public static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
       // int number = sc.nextInt();
        if (sc.hasNextInt()) { // как сделать проверку, чтоб подходило и число int и long
            return sc.nextInt();
        }
        else{
            System.out.println("Вы ввели не число. Повторите ввод");
            return enterNumber();
        }
    }

    public static int sumNumbers(int number){
        int sum = 0;
        while(number > 0){
            sum += (int) number % 10;
            number = number / 10;
        }
        return sum;
    }
}

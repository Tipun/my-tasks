package ex_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double resalt = calk(num1,num2,operation);
        System.out.println(resalt);
    }

    public static double getNumber(){
        System.out.println("Введите вещественное число");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()){
            return sc.nextDouble();
        }
        else{
            System.out.println("Вы ввели не число, повторите ввод");
            return getNumber();
        }
    }
    public static char getOperation(){
        System.out.println("Введите операцию : \n'+'- сложить\n'-'- вычесть\n'*'- умножить\n'/' - разделить" +
                "\n'%' - остаток oт деления\n'^' - корень" );
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch (s) {
            case "+":
                return '+';
            case "-":
                return '-';
            case "*":
                return '*';
            case "/":
                return '/';
            case "%":
                return '%';
            case "^":
                return '^';
            default:
                System.out.println("Введите корректную операцию");
                return getOperation();
        }
    }
    public static double sum (double num1,double num2){
        return num1 + num2;
    }
    public static double sub (double num1,double num2){
        return num1 - num2;
    }
    public static double mul (double num1,double num2){
        return num1 * num2;
    }
    public static double div (double num1,double num2){
        return num1 / num2;
    }
    public static double ost (double num1,double num2){
        return num1 % num2;
    }
    public static double kor (double num1,double num2){
        return Math.pow( num1, 1.0 / num2 );
    }
    public static double calk(double num1 , double num2, char operation){
        switch (operation){
            case '+':
                return sum(num1 ,num2);
            case '-':
                return sub(num1 ,num2);
            case '*':
                return mul(num1 ,num2);
            case '/':
                return div(num1 ,num2);
            case '%':
                return ost(num1 ,num2);
            case '^':
                return kor(num1 ,num2);
            default:
                return Double.NaN;
        }

    }
}

package ex_5;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i > 0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Сумма чисел равна " + sum);
    }
}

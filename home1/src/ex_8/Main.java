package ex_8;

public class Main {
    public static double faringate(double c){
        return c * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        final double celsii = 36.6;
        System.out.printf("Данная температура по шкале Фарингейта равна: %.2f ", faringate(celsii));
    }
}

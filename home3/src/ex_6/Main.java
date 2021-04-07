package ex_6;

public class Main {
    public static void main(String[] args) {
        for (double i = 1.2; i < 3.0; i = i + 0.2) {
            if(i >= 2.7 && i <= 2.9){
                System.out.printf("%.2f.",i);
                break;
            }
            System.out.printf("%.2f, ",i);
        }
    }
}

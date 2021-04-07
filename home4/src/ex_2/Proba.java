package ex_2;

import java.util.Random;

public class Proba {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        while (sum <= 10) {
            int rand = random.nextInt(2);
            sum += rand;
            System.out.print(rand);
        }
    }
}

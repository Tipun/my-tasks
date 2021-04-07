package ex_3;

public class Main {
    public static void main(String[] args) {
        int[] rez = new int[15];
        int a;
        int b;
        boolean replay = false;

        for (int i = 0; i < rez.length; i++) {
            replay = false;
            a = (int) (2 + Math.random() * 8);// что выделить в метод кроме рандома?
            b = (int) (2 + Math.random() * 8);
            int result = a * b;
            rez[i] = result;
            for (int j = i; j >= 0; j--) {
                if (rez[j] == rez[i] && j != i) {
                    replay = true;
                    i --;
                    break ;
                }
            }
            if (replay == false) {
                System.out.println((i + 1) + " : " + a + " * " + b + " = " + result);
            }
        }


    }


}

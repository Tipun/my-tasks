package ex_9;

public class Main {
    public static void main(String[] args) {
        int n;
        int q = 0;
        for (int i = 1; i <= 15; i++) {
            n = (int) (Math.random() * 2);
            if (n == 1) {
                q++;
                if (q > 3) {
                    n = 0;
                }
            }
// не стал додумывать вариант когда генерируются одни нули
            System.out.print(n + " ");
        }
    }
}

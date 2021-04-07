package ex_9;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        a = a + b;  // 15 + 5 = 20;
        b = a - b;  // 20 - 5 = 15;
        a = a - b;  // 20 - 15 = 5;

        System.out.println("a = " + a + "\nb = " + b);
    }
}

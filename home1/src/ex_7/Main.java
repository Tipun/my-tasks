package ex_7;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 5;

//        a += b;          загугленное решение, в чем его смысл?
//        b = c - a + b;
//        c = a + c;
        a+=b;
        b = c - a;
        c = a + b + c;
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
    }
}

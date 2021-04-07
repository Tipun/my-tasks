package ex_7;

public class Main {
    public static void main(String[] args) {
       int a;
       int b;
       int c;

        do{
           a = (int) (Math.random() * 101);
           b = (int) (Math.random() * 101);
           c = (int) (Math.random() * 101);
        }while(a == b || b == c || c == a);
        System.out.println(a + " " + b + " " + c);
    }
}

package ex_10;

public class A {
    public static void main(String[] args) {
        int a = 13;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a--;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}

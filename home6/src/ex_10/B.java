package ex_10;

public class B {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a--;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}

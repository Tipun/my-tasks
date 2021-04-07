package ex_10;

public class D {
    public static void main(String[] args) {
        int a = 0 ;

        for (int i = 0; i < 3; i++) {
            a = a + 5;
            for (int j = 0; j < 4; j++) {
                a--;
                System.out.print(a + "\t");
            }
            a = a + 3;
            System.out.println();
        }
    }
}

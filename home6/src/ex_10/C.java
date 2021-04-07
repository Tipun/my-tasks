package ex_10;

public class C {
    public static void main(String[] args) {
        int a = -2;

        for (int i = 0; i < 3; i++) {
            if(i == 1)
                a = -1;
            if(i == 2)
                a = 0;
            for (int j = 0; j < 3; j++) {
                a+=3;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}

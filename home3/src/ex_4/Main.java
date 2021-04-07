package ex_4;

public class Main {
    public static void main(String[] args) {
        for (int i = 1001; i < 1026 ; i=i+3) {
            if(i == 1025) {
                System.out.print(i + ".");
                break;
            }
            System.out.print(i + ", ");

        }
    }
}

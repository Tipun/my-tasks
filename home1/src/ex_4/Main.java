package ex_4;

public class Main {
    public static void nulls(int qStr){
        for (int i = 0; i < qStr; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("0");
        System.out.println("00");
        System.out.println("000");
        System.out.println("0000");
        System.out.println("00000");
        System.out.println();
        // через метод
        nulls(5);
    }
}

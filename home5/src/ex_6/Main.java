package ex_6;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        boolean m = false;
        int[] arr = new int[1000000];
        first:
        for (int i = 100000; i < 1000000; i++) {
            int c = i;
            for (int j = 0; j < 6; j++) {
                sum += c % 10;
                c /= 10;
            }
                arr[i] = sum;
                sum = 0;
                if ((arr[i] % 13 == 0) && ((arr[i - 1]) % 13 == 0)) {
                    m = true;
                    System.out.println("Могут");
                    System.out.println("Первые билеты с совпадением номер " + i + " и " + (i - 1));
                    break first;
                }

        }
        if (m = false) {
            System.out.println("Не могут");
        }
    }
}

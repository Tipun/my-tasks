package ex_9;

public class Main {
    public static void main(String[] args) {

        int c = 0;
        int sum = 0;
        String posl = "";
        int q = 1;
        int q1 = 0;
        int q2 = 0;
        double q2All = 0;
        double lengthAll = 0;
        first:
        while (q <= 20) {
            sum = 0;
            while (sum <= 12) {
                c = (int) (Math.random() * 3);
                sum += c;
                String cs = String.valueOf(c);
                posl = posl + cs;
                if (sum > 12) {
                    posl = "";
                    sum = 0;
                    continue first;
                }
                else if (sum == 12) {
                    System.out.println("Серия " + q + " " + posl);
                    for (int i = 0; i < posl.length(); i++) {
                        if (posl.charAt(i) == '1') {
                            q1++;
                        }
                        if (posl.charAt(i) == '2') {
                            q2++;
                        }
                    }
                    System.out.println("Количество единиц в серии равно " + q1);
                    System.out.println("Количество двоек в серии равно " + q2);
                    q2All += q2;
                    System.out.println("Длина серии " + posl.length());
                    lengthAll += posl.length();
                    q1 = 0;
                    q2 = 0;
                    q++;
                }

            }
        }
        System.out.println("Среднее количество двоек в сериях равно " + q2All/20);
        System.out.println("Средняя длина серияи равна " + lengthAll/20);

    }
}
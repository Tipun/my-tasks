package ex_1;

public class Main {

    public static String dayOfTheWeek(int n) {
        String[] days = new String[7];
        days[0] = "Понедельник";
        days[1] = "Вторник";
        days[2] = "Среда";
        days[3] = "Четверг";
        days[4] = "Пятница";
        days[5] = "Суббота";
        days[6] = "Воскресенье";
        if (n < 1 || n > 7) {
            return "Вызовите метод с параметром от 1 до 7";
        }
        for (int i = 0; i < days.length; i++) {
            if (i == n - 1) {
                return days[i];
            }
        }
       return null;// Получается что если решать через стринг а не через воид, этот ретерн необходим, хотя в решении лишний.
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(dayOfTheWeek(n));
    }
}

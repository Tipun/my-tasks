package ex_8;

public class Main {
    public static void main(String[] args) {
        int c = 0;
        String str = "";
        for (int i = 0; i < 10; i++) {
            c = (int) (Math.random() * 4);
            str = str + Integer.toString(c);

        }
        System.out.println(str);
        int two = 0;
        int three = 0;
        int threeEven = 0;
        int twoFirst5 = 0;
        for (int i = 0; i < 10; i++) {
           if(str.charAt(i) == '2'){
               two++;
           }
           if(str.charAt(i) == '3'){
               three++;
           }
        }
        if(two > three){
            System.out.println("Количество двоек больше количества троек на " + (two - three));
        }
        else if (two == three){
            System.out.println("Количество двоек равно количеству троек " );
        }
        else if (two < three){
            System.out.println("Количество троек больше количества двоек на " + (three - two));
        }
        for (int i = 0; i < 10; i++) {
            if((str.charAt(i) == '3') && ((i + 1)%2 == 0)) {
                threeEven++;
            }
        }
        System.out.println("Количество троек, стоящих на четных местах равно " + threeEven);
        for (int i = 0; i < 10; i++) {
            if((str.charAt(i) == '2') && (i <= 4)) {
                twoFirst5++;
            }
        }
        System.out.println("Количество двоек, среди первых пяти чисел последовательности равно " + twoFirst5);

    }
}

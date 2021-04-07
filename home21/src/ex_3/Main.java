package ex_3;

public class Main {
    public static void main(String[] args) {
        String str = "1мы в3 658до6роге с 56песен89кой о лете";
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if(a == '0' || a == '1' || a=='2' || a=='3' || a=='4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' ){
                number++;
            }
        }
        System.out.println("Количество цифр в строке " + number);
    }
}

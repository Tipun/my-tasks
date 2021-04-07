package ex_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str =  "One two three раз два три one1 two2 123 two ";
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\s");
        Matcher matcher = pattern.matcher(str);
        int q = 0;
        while (matcher.find()){
            q ++;
        }
        System.out.println("Количество слов содержащих только латинские символы = " + q);
    }
}

package ex_11;

import java.util.regex.Pattern;

public class Proba {
    public static void main(String[] args) {
        String input = "Hello ghju";
        boolean found = Pattern.matches("Hello", input);
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");
    }
}

package ex_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите IP адрес");
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("([0-9]{1,3}\\.){3}[0-9]{1,3}");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            System.out.println("Это IP адрес");
        }
        else {
            System.out.println("Это не IP адрес");
        }
    }
}

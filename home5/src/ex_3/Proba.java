package ex_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Proba {
    public static void main(String[] args) {
        int a = 123;
        String str = Integer.toString(a);
        System.out.println(str + 2);
        int b = 25;
        String str1 = String.valueOf(b);
        System.out.println(str1 + 5);

        int i = Integer.parseInt(str1);
        System.out.println(i + 5);
    }
}

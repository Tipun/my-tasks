package ex_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String txt = "cab ccab cccab aacb ccccab";
            Pattern pattern = Pattern.compile("c{1,3}ab");
            Matcher matcher = pattern.matcher(txt);
            while(matcher.find()){
                System.out.println(txt.substring(matcher.start(),matcher.end()));
            }
    }
}

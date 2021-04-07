package Task04;

import java.util.Arrays;

public class MainString {
    char[] charString;
    int stringLength;

    public MainString() {
        charString =new char[] {'h','e','l','l','o'};
        stringLength = charString.length;
        System.out.println(Arrays.toString(charString));
        System.out.println(stringLength);
    }
    public MainString(String str){
        charString = str.toCharArray();
        //charString = new char[str.length()];
        // for (int i = 0; i < charString.length ; i++) {
        //    charString[i] = str.charAt(i);
        //}
        System.out.println(Arrays.toString(charString));
        stringLength = str.length();
        System.out.println(stringLength);
    }
    public MainString(char s){
        charString =new char[] {'h','e','l','l','o'};
        for (int i = 0; i < charString.length; i++) {
            if (charString[i] == s){
                charString[i] = Character.toUpperCase(charString[i]);
            }

        }
        System.out.println(Arrays.toString(charString));
        stringLength = charString.length;
        System.out.println(stringLength);
    }
    public int lengthOfString(){
        return charString.length;
    }
    public void doStringVoid(){
        this.charString = null;
        System.out.println(Arrays.toString(charString));
    }

}

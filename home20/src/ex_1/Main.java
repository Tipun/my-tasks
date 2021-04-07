package ex_1;

public class Main {
    public static void main(String[] args) {
        String str = new String("I like Java!!!");   //a
        System.out.println(str.charAt(str.length() - 1));    //b
        if(str.endsWith("!!!")){                                //в
            System.out.println("Заканчивается !!!");
        }
        if(str.startsWith("I like")){                                //г
            System.out.println("Начинается I like");
        }
        if(str.contains("Java")){                                //д
            System.out.println("содержит Java");
        }
        System.out.println(str.indexOf("Java"));                //е
        String str1 = str.replace('a','о');
        System.out.println(str1);

        String str2 = str.toUpperCase();
        System.out.println(str2);

        String str3 = str.toLowerCase();
        System.out.println(str3);

        String str4 = str.substring(7,11);
        System.out.println(str4);
    }
}

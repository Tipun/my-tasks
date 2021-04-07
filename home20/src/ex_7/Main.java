package ex_7;

public class Main {
    public static void main(String[] args) {
        String str1 = "abcМы в дороге с песенкой о лете";
        if(str1.startsWith("abc")){
            str1 = str1.replace("abc","www");
            System.out.println(str1);
        }
        else{
            str1 = str1 + "www";
            System.out.println(str1);
        }
    }
}

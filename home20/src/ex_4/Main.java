package ex_4;

public class Main {
    public static void main(String[] args) {
        String str = "Мы в дороге с песенкой о лете";
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(str.length()-1)){
                System.out.println(i);
            }
        }
    }
}

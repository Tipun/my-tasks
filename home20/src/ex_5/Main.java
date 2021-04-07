package ex_5;

public class Main {
    public static void main(String[] args) {
        String str = "Мы в дороге с песенкой о лете";
        for (int i = 3; i < str.length(); i++) {
            if(i % 3 == 0){
                System.out.println(str.charAt(i));
            }
        }
    }
}

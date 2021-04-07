package ex_6;

public class Main {
    public static void main(String[] args) {
        String str1 = "Мы в дороге с песенкой о лете";
        String str2 = "Самой лучшей песенкой на свете";
        int a = str1.length() - str2.length();
        for (int i = 0; i < Math.abs(a) ; i++) {
            if (a == 0){
                break;
            }
            else if(a > 0){
                System.out.println(str1);
            }
            else{
                System.out.println(str2);
            }
        }
    }
}

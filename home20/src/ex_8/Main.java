package ex_8;

public class Main {
    public static void main(String[] args) {
        String str1 = "Мы в д";
        if(str1.length() > 10){
            str1 = str1.substring(0,6);
            System.out.println(str1);
        }
        else{
            while(str1.length() < 12){
                str1 = str1 + 'о';
            }
            System.out.println(str1);
        }
    }
}

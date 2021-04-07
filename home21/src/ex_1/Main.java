package ex_1;

public class Main {
    public static void main(String[] args) {
        String str = "Practice";
        int a = ((str.length()-1) / 2);
        int b = a + 2;
        System.out.println(str.substring(a,b));
    }
}

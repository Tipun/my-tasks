package ex_2;

public class ex_2 {
    public static void main(String[] args) {
        String str = "Приветt";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        if((str.length() - 1)%2 == 0){
            System.out.println(str.charAt((str.length()-1) / 2));
        }
        else {
            System.out.println("Среднего символа нет");
        }
    }
}

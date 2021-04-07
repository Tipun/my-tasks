package ex_5;

public class Main {
    public static void main(String[] args) {
        System.out.println(quantityLucky());
    }
    public static int quantityLucky(){
        int sumFirst3 = 0;
        int sumLast3 = 0;
        int q = 0;
        for (int i = 1; i < 999999; i++) {
            if((i%10)+(i/10%10)+(i/100%10) == (i/1000%10)+(i/10000%10)+(i/100000%10)){
                q++;
            }
        }
        return q;
    }
}

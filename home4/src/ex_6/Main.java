package ex_6;

public class Main {
    static void chislami (){
        for (int i = 1000; i <10000 ; i++) {
            if((i%10 != i%100/10 && i%10 != i%1000/100 && i%10 != i%10000/1000) && (i%100/10 != i%1000/100 && i%100/10!=
                    i%10000/1000) && (i%1000/100 != i%10000/1000) )      {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        chislami();

    }
}

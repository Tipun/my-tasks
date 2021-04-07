package ex_4;

public class Main {
    static int plus(int a , int b){
        if (a < b) {
            System.out.println(a++);

            Main.plus(a,b);

        }
        else if(a > b){
            System.out.println(a--);

            Main.plus(a,b);
        }
        else if(a == b){
            System.out.println(a);
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        Main.plus(a,b);
    }
}

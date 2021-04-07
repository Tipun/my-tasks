package ex_5;
class B {
    static void byStrings(){
        String str;
        boolean print = true;
        for (int i = 1000; i < 10000; i++) {
            print = true;
            str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '5' || str.charAt(j) == '6') {
                    print = false;
                    break;
                }
            }
            if (print == true)
                System.out.print(i + " ");
        }

    }
}
public class Main {
    static void chislami (){
        for (int i = 1000; i <10000 ; i++) {
            if(i%10!=5 && i%10!=6 && i%100/10!=5 && i%100/10!=6 && i%1000/100!=5 && i%1000/100!=6 && i%10000/1000!=5 && i%10000/1000!=5){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        //Main.chislami();
        B.byStrings();
    }
}


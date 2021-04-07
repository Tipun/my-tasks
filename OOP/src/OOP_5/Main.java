package OOP_5;

public class Main {
    public static void main(String[] args) {

    int A = 5;
    int B = 15;
    rec(A,B);
}
    public static void rec (int A,int B){
        if (A < B){
            System.out.print(A + " ");
            A = ++A;
            if(A == B){
                System.out.println(A);
            }
            rec(A,B);
        }
        if (A > B){
            System.out.print(A + " ");
            A = --A;
            if(A == B){
                System.out.println(A);
            }
            rec(A,B);
        }
    }

}

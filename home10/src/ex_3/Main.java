package ex_3;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.init(m.arr);
        m.init(m.arr2);
        m.print(m.arr);
        System.out.println();
        //m.print(m.arr2);
        System.out.println();
       // m.print(m.multi(m.arr,m.arr2));
        m.print(m.multiCh(m.arr));
    }
}

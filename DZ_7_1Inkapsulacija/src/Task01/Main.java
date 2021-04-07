package Task01;

public class Main {
    public static void main(String[] args) {
        int count = 3;


        while (count > 0) {
            int l = new Range().calcRange();
            System.out.println(l);
            count--;
        }

    }
}

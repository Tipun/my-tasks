package ex_2;

public class Main {
    public static void main(String[] args) {
        Numbers num = new Numbers(5,6);
        num.getInfo();
        num.setChange(15,16);
        System.out.println(num.sum());
        System.out.println(num.greater());
    }
}

package Task04;

public class Main {
    public static void main(String[] args) {
        MainString obj1 = new MainString();
        MainString obj2 = new MainString("Привет");
        MainString obj3 = new MainString('h');
        int a = obj2.lengthOfString();
        System.out.println(a);
        obj2.doStringVoid();

    }
}

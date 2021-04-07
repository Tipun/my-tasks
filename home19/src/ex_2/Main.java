package ex_2;

public class Main {
    public static void main(String[] args) {
        Town t1 = new Town("Иваново");
        Town.Street s1 = t1.createStreet(233566,"Комарова",15);
        System.out.println(s1.toString());
        System.out.println();
        Town t2 = new Town("Брест");
        Town.Street s2 = t2.createStreet(111256,"Махновича",6);
        System.out.println(s2.toString());


    }
}

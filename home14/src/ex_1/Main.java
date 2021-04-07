package ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Введите количество котов");
//        Scanner sc = new Scanner(System.in);
//        int q = sc.nextInt();
//        for (int i = 0; i < q; i++) {
//            System.out.println("Введите имя кота");
//            Scanner sc1 = new Scanner(System.in);
//            String name = sc1.nextLine();
//            System.out.println("Введите возраст кота");
//            int age = sc1.nextInt();
//            Cat cat = new Cat(name,age);
//        }

        for (int i = 1; i <= 10; i++) {
            Cat cat = new Cat("cat"+ i, (int)(Math.random()*11));
        }
        Cat.printCats();
    }
}

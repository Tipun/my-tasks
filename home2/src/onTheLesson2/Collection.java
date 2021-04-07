package onTheLesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {
        // первая работа с коллекциями
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Введите число №" + i);
            int a = sc.nextInt();
            if(a % 2 == 0){
                even.add(a);
            }
        }
         if(even.isEmpty() == true){
             System.out.println("no found");
         }
         else{
             Collections.sort(even);
             System.out.println(even.get(even.size() - 1) + " наибольшее четное число");
         }

    }
}

package ex_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        try {
            String s = list.get(18);
        }
        catch (Exception e){
            System.out.println("Ошибка перехвачена");
            String s = e.getClass().getSimpleName();
            System.out.println(s);
        }
    }
}

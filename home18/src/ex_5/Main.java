package ex_5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
        HashMap map = new HashMap(null);

            map.put(null, null);
        }
        catch (Exception e){
            String s = e.getClass().getSimpleName();
            System.out.println(e);
        }
//        try {
//            map.remove(null);
//        }
//        catch (Exception e){
//            String s = e.getClass().getSimpleName();
//            System.out.println(s);
//        }
    }
}

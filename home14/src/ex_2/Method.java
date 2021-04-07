package ex_2;

import java.io.OptionalDataException;
import java.util.Arrays;

public class Method {
    static int number(int a, int b){
        int i = a + (int) (Math.random() * ((b + 1) - a));
        return i;
    }
    static int[]arr = new int[20];
    static void printArr(int[]arr){
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
class Main {
    public static void main(String[] args) {
        for (int i = 0; i < Method.arr.length; i++) {
            Method.arr[i] = Method.number(-10,10);
        }
        Method.printArr(Method.arr);
    }

}
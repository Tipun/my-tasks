package ex_1;

public class Main {
    public static void main(String[] args) {
        int[]arr = new int[10];
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 2);
            if(arr[i] == 0){
                q++;
            }
            if(q >= 5){
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

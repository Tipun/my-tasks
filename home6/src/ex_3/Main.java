package ex_3;

public class Main {
    public static void main(String[] args) {
        int[]arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 + (int)(Math.random() * 4) ;
            if(arr[i] == 3){
                i--;
                continue;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

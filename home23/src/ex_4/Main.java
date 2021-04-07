package ex_4;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        Cvadrable cv = n -> n * n;
        print(arr,cv);
    }
    public static void print(int[]arr,Cvadrable cv){
        for(int i = 0; i < arr.length; i++){
            System.out.println(cv.cvadrat(arr[i]));
        }
    }
}
interface Cvadrable{
    int cvadrat(int n);
}

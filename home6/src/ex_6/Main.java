package ex_6;

public class Main {
    public static void main(String[] args) {
        //правило генерации - случайными числами от 1 до 10 нечетное чередуется с четным, первый элемент - нечетное число
        int[]arr = new int[]{3,6,7,6,1,8,9,10};
        boolean gen = true;
        for (int i = 0; i < arr.length ; i++) {
            if(i % 2 == 0 && (arr[i] % 2 == 0 || arr[i] < 1 || arr[i] > 10)) {
                 gen = false;
                System.out.println("Правило генерации не соблюдается");
                break;
            }
            if(i % 2 != 0 && (arr[i] % 2 != 0 || arr[i] < 1 || arr[i] > 10)) {
                 gen = false;
                System.out.println("Правило генерации не соблюдается");
                break;
            }
        }
        if (gen == true){
            System.out.println("Правило генерации соблюдается");
        }
    }
}

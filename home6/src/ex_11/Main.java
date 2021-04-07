package ex_11;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int[][]arr = new int[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                a = --a;
                if(i % 2 == 0 && j % 2 != 0) {
                    a = Math.abs(a);
                }
                if(i % 2 != 0 && j % 2 == 0) {
                    a = Math.abs(a);
                }
                System.out.print(a + "\t\t");
                arr[i][j] = a;
                if(i % 2 == 0 && j % 2 != 0) {
                    a = -a;
                }
                if(i % 2 != 0 && j % 2 == 0) {
                    a = -a;
                }
            }
            System.out.println();
        }
        int qStr = 0;
        int qCol = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if(arr[i][j] < 0){
                    qStr++;
                }
            }
            System.out.println("Количество отридцательных элементов в строке " + (i + 1) + " = " + qStr);
            qStr = 0;
        }

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 5; i++) {
                if(arr[i][j] < 0){
                    qCol++;
                }

            }
            System.out.println("Количество отридцательных элементов в столбце " + (j + 1) + " = " + qCol);
            qCol = 0;
        }
    }
}

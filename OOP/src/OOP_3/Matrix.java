package OOP_3;

public class Matrix {
    private int n;
    private int m;
    private double[][]arr;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public double[][] getArr() {
        return arr;
    }

    public void setArr(double[][] arr) {
        this.arr = arr;
    }

    public double[][] sumMatrix (double[][]mas){
        double [][]sumArr = new double[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                sumArr[i][j]= arr[i][j] + mas[i][j];
            }
        }
        return sumArr;
    }
    public double[][] multMatrix (double[][]mas,int c){
        double [][]multArr = new double[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                multArr[i][j]= mas[i][j] * c;
            }
        }
        return multArr;
    }
    public static void print(double[][]mas){
            int line = mas.length;
            int col = mas[0].length;
        for (int i = 0; i < line ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
    }
}

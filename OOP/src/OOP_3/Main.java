package OOP_3;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.setN(3);
        m.setM(4);
        double[][] arr = new double[][]{{1,1,1,1},{2,2,2,2},{3,3,3,3}};
        double[][] mas = new double[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        m.setArr(arr);
        double[][] sumMas = m.sumMatrix(mas);
        Matrix.print(sumMas);
        int c = 2;
        double[][] multMas = m.multMatrix(sumMas,c);
        Matrix.print(multMas);
    }
}

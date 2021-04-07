package ex_3;

import java.util.Scanner;

public class Matrix {
    int i;
    int j;
    double[][] arr;
    double[][] arr2;

    Matrix() {
        System.out.println("Введите количество строк матрицы");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        j = sc.nextInt();
        arr = new double[i][j];
        arr2 = new double[i][j];
    }

    double[][] init(double mas[][]) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = Math.random() * 10;
            }
        }
        return mas;
    }

    void print(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.2f ", arr[i][j]);
            }
            System.out.println();
        }
    }

    double[][] multi(double[][] mas, double[][] mas2) {
        double masMul[][] = mas;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                masMul[i][j] = mas[i][j] + mas2[i][j];
            }
        }
        return masMul;
    }
    double[][] multiCh1(double[][] mas, int c) {
        double masMul[][] = mas;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                masMul[i][j] = mas[i][j] * c;
            }
        }
        return masMul;
    }

    double[][] multiCh(double[][] mas) {
        System.out.println("Введите множитель матрицы");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double masMul[][] = mas;
        masMul = multiCh1(mas,c);
        return masMul;
    }
}

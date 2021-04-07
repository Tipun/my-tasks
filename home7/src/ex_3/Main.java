package ex_3;

public class Main {
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static double average(int[] arr) {
        double averag = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return averag = sum / arr.length;
    }

    static int quantitiMinMax(int[] arr) {
        int indMin = 0;
        int indMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max(arr)) {
                indMax = i;
            }
            if (arr[i] == min(arr)) {
                indMin = i;
            }
        }
        return Math.abs(indMax - indMin) - 1;
    }

    static int firstSimple(int[] arr) {
        boolean sim = true;
        for (int i = 0; i < arr.length; i++) {
            sim = true;
            for (int j = 1; j <= Math.abs(arr[i]); j++) {
                if (((Math.abs(arr[i]))%j == 0) && (j != 1) && (j != Math.abs(arr[i]))) {
                    sim = false;
                    break;
                }
            }
            if (sim == true){
                return arr[i];
            }
        }
        System.out.println("нет простых чисел");
        return -1;
    }
    static int lastSimple(int[] arr){
        boolean sim = true;
        for (int i = arr.length - 1; i >= 0; i--) {
            sim = true;
            for (int j = 1; j <= Math.abs(arr[i]); j++) {
                if (((Math.abs(arr[i]))%j == 0) && (j != 1) && (j != Math.abs(arr[i]))) {
                    sim = false;
                    break;
                }
            }
            if (sim == true){
                return arr[i];
            }
        }
        System.out.println("нет простых чисел");
        return -1;
    }
    static int qSimple(int[] arr) {
        boolean sim = true;
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            sim = true;
            for (int j = 1; j <= Math.abs(arr[i]); j++) {
                if (((Math.abs(arr[i]))%j == 0) && (j != 1) && (j != Math.abs(arr[i]))) {
                    sim = false;
                    break;
                }
            }
            if (sim == true){
                q++;
            }
        }
        return q;
    }
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int max = max(numbers);
        System.out.println("Максимальный элемент массива " + max);
        int min = min(numbers);
        System.out.println("Минимальный элемент массива " + min);
        System.out.println("Среднее арифметическое массива равно " + average(numbers));
        System.out.println("Количество элементов между максимальным и минимальным элементами массива равно " +
                quantitiMinMax(numbers));
        System.out.println("Первое простое число в массиве " + firstSimple(numbers));
        System.out.println("Последнее простое число в массиве  " + lastSimple(numbers));
        System.out.println("Количество простых чисел в массиве  " + qSimple(numbers));
    }
}

package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Alg10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Alg10 alg10 = new Alg10();
        System.out.println("Введите N:");
        int n = scanner.nextInt();
        int[] array = alg10.generationArray(n);
        int[] result = alg10.replacingValuesWithZeros(array);
        System.out.println(Arrays.toString(result));
    }

    private int[] replacingValuesWithZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    private int[] generationArray(int size) {
        int[] array = new int[size];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 10);
        }
        System.out.println("Данный массив: " + Arrays.toString(array) + " ");
        return array;
    }
}

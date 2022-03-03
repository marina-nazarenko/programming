package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Alg3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Alg3 alg3 = new Alg3();

        System.out.println("Введите N:");
        int n = scanner.nextInt();

        alg3.count(n);
    }

    private int[] generationArray(int size) {
        int[] array = new int[size];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 10) - 5;
        }
        System.out.println("Данный массив: " + Arrays.toString(array) + " ");
        return array;
    }

    private void count(int n) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int[] array = generationArray(n);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }
            if (array[i] < 0) {
                negative++;
            }
            if (array[i] == 0) {
                zero++;
            }
        }
        System.out.println("Количество положительных чисел: " + positive);
        System.out.println("Количество отрицательных чисел: " + negative);
        System.out.println("Количество нулей: " + zero);
    }
}

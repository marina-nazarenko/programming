package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sorting6 sorting6 = new Sorting6();

        System.out.println("Введите длину массива:");
        int size = scanner.nextInt();
        int[] array = ArrayUtils.generationArray(size);

        System.out.println("\nРезультат:");
        int[] concatenatedArray = sorting6.shellSorting(array);
        System.out.println(Arrays.toString(concatenatedArray));
    }

    private int[] shellSorting(int[] array) {
        int j;
        int step = array.length / 2;
        while (step > 0) {
            for (int i = 0; i < (array.length - step); i++) {
                j = i;
                while ((j >= 0) && (array[j] > array[j + step])) {
                    int tmp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = tmp;
                    j -= step;
                }
            }
            step = step / 2;
        }

        return array;
    }

    private int[] shellSorting2(int[] array) {
        int h = 1;
        while (h < array.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] > array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }

        return array;
    }
}
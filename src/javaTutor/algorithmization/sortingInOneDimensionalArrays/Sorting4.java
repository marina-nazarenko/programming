package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sorting4 sorting4 = new Sorting4();

        System.out.println("Введите длину массива:");
        int size = scanner.nextInt();
        int[] array = ArrayUtils.generationArray(size);

        System.out.println("\nРезультат:");
        int[] concatenatedArray = sorting4.exchangeSorting(array);
        System.out.println(Arrays.toString(concatenatedArray));
    }

    private int[] exchangeSorting(int[] array) {
        int count = 0;
        int k;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                    count++;
                }
            }
        }

        System.out.println("Колличество перестановок - " + count);
        return array;
    }
}
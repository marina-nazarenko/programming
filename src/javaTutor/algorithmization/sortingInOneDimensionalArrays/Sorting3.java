package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sorting3 sorting3 = new Sorting3();

        System.out.println("Введите длину массива:");
        int size = scanner.nextInt();
        int[] array = ArrayUtils.generationArray(size);

        System.out.println("\nРезультат:");
        int[] concatenatedArray = sorting3.selectionSorting(array);
        System.out.println(Arrays.toString(concatenatedArray));
    }

    private int[] selectionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxValue = array[i];
            int indexMaxValue = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > maxValue) {
                    indexMaxValue = j;
                    maxValue = array[j];
                }
            }
            array[indexMaxValue] = array[i];
            array[i] = maxValue;
        }

        return array;
    }
}
package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sorting5 sorting5 = new Sorting5();

        System.out.println("Введите длину массива:");
        int size = scanner.nextInt();
        int[] array = ArrayUtils.generationArray(size);

        System.out.println("\nРезультат:");
        int[] concatenatedArray = sorting5.insertionSorting(array);
        System.out.println(Arrays.toString(concatenatedArray));
    }

    private int[] insertionSorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int flag = array[i];
            int j = i - 1;
            while (j >= 0 && flag < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = flag;
        }

        return array;
    }
}
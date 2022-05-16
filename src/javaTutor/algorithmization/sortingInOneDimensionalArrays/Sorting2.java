package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sorting2 sorting2 = new Sorting2();

        System.out.println("Введите длину первого массива:");
        int sizeArrayOne = scanner.nextInt();
        int[] arrayOne = sorting2.generationArray(sizeArrayOne, 1);

        System.out.println("\nВведите длину второго массива:");
        int sizeArrayTwo = scanner.nextInt();
        int[] arrayTwo = sorting2.generationArray(sizeArrayTwo, 3);

        System.out.println("\nРезультат:");
        int[] concatenatedArray = sorting2.unionOfArrays(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(concatenatedArray));
    }

    private int[] unionOfArrays(int[] arrayOne, int[] arrayTwo) {
        int[] concatenatedArray = new int[arrayOne.length + arrayTwo.length];
        int mOne = 0;
        int nTwo = 0;
        int i = 0;

        while (i < concatenatedArray.length) {
            while (mOne < arrayOne.length && nTwo < arrayTwo.length) {
                if (arrayOne[mOne] <= arrayTwo[nTwo]) {
                    concatenatedArray[i++] = arrayOne[mOne++];
                } else {
                    concatenatedArray[i++] = arrayTwo[nTwo++];
                }
            }

            if (nTwo == arrayTwo.length) {
                concatenatedArray[i++] = arrayOne[mOne++];
            } else {
                concatenatedArray[i++] = arrayTwo[nTwo++];
            }
        }

        return concatenatedArray;
    }

    private int[] generationArray(int size, int k) {
        int[] array = new int[size];
        for (int j = 0; j < array.length; j++) {
            array[j] = j + k;
        }
        System.out.println("Данный массив: " + Arrays.toString(array) + " ");

        return array;
    }
}
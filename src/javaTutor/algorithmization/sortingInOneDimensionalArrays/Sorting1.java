package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sorting1 sorting1 = new Sorting1();

        System.out.println("Введите длину первого массива:");
        int sizeArrayOne = scanner.nextInt();
        int[] arrayOne = sorting1.generationArray(sizeArrayOne, 1);

        System.out.println("\nВведите длину второго массива:");
        int sizeArrayTwo = scanner.nextInt();
        int[] arrayTwo = sorting1.generationArray(sizeArrayTwo, 2);

        System.out.println("\nВведите число k:");
        int k = scanner.nextInt();

        System.out.println("\nРезультат:");
        int[] concatenatedArray = sorting1.unionOfArrays(arrayOne, arrayTwo, k);
        System.out.println(Arrays.toString(concatenatedArray));
    }

    private int[] unionOfArrays(int[] arrayOne, int[] arrayTwo, int k) {
        int[] concatenatedArray = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0; i < concatenatedArray.length; i++) {
            if (i < k) {
                concatenatedArray[i] = arrayOne[i];
            } else if (i - k < arrayTwo.length) {
                concatenatedArray[i] = arrayTwo[i - k];
            } else {
                concatenatedArray[i] = arrayOne[i - arrayTwo.length - 1];
            }
        }

        return concatenatedArray;
    }

    private int[] generationArray(int size, int value) {
        int[] array = new int[size];
        Arrays.fill(array, value);
        System.out.println("Данный массив: " + Arrays.toString(array) + " ");

        return array;
    }
}
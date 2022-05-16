package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sorting3 sorting3 = new Sorting3();

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
}

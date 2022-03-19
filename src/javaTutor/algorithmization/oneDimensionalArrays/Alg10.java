package javaTutor.algorithmization.oneDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Alg10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Alg10 alg10 = new Alg10();
        System.out.println("Введите N:");
        int n = scanner.nextInt();
        int[] array = ArrayUtils.generationArray(n);
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
}
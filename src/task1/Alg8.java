package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Alg8 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Alg8 alg8 = new Alg8();
        System.out.println("Введите N:");
        int n = scanner.nextInt();
        int[] array = alg8.generationArray(n);
        int[] result = alg8.removeMinValues(array);
        System.out.println("Новый массив с учетом удаления минимальных значений: ");
        System.out.println(Arrays.toString(result));
    }

    private int[] removeMinValues(int[] array) {
        int min = findMinValue(array);
        int count = countMinValue(min, array);
        int size = array.length;
        int[] newArray = new int[size - count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value != min) {
                newArray[j] = value;
                j++;
            }
        }
        return newArray;
    }

    private int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private int countMinValue(int min, int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                count++;
            }
        }
        return count;
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

package task1;

import java.util.Arrays;

public class SecondMaxValue {
    public static void main(String[] args) {
        SecondMaxValue secondMaxValue = new SecondMaxValue();
        int[] array = secondMaxValue.generationArray(5);
        int result = secondMaxValue.findSecondMaxValue(array);
        System.out.println("Второе максимальное чило в массиве равно: " + result);
    }

    private int findSecondMaxValue(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }

        int secondMaxValue = min;

        for (int i = 1; i < array.length; i++) {
            if (secondMaxValue < array[i] && array[i] < max) {
                secondMaxValue = array[i];
            }
        }
        return secondMaxValue;
    }

    private int[] generationArray(int size) {
        int[] array = new int[size];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 5) - 5;
        }
        System.out.println("Данный массив: " + Arrays.toString(array) + " ");
        return array;
    }
}


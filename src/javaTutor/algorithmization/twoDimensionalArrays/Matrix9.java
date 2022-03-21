package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix9 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Matrix9 matrix9 = new Matrix9();
        System.out.println("Введите размер x: ");
        int sizeX = scanner.nextInt();
        System.out.println("Введите размер y: ");
        int sizeY = scanner.nextInt();
        int[][] matrix = ArrayUtils.generationMatrix(sizeX, sizeY);
        int[] sumOfValuesInEachColumn = matrix9.sumOfValuesInEachColumn(matrix);
        matrix9.indexOfMaxSumInColumn(sumOfValuesInEachColumn);
    }

    private void indexOfMaxSumInColumn(int[] arraySum) {
        int maxSum = arraySum[0];
        int index = 0;
        for (int i = 0; i < arraySum.length; i++) {
            if (maxSum < arraySum[i]) {
                maxSum = arraySum[i];
                index = i;
            }
        }
        System.out.println("Максимальное значение суммы в столбце № - " + ++index);
    }

    private int[] sumOfValuesInEachColumn(int[][] matrix) {
        int[] arraySum = new int[matrix[0].length];
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                arraySum[j] += ints[j];
            }
        }
        System.out.println("Сумма значений в столбцах: " + Arrays.toString(arraySum));

        return arraySum;
    }
}
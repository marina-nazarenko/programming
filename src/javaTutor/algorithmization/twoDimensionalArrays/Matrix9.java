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
        matrix9.sumOfValuesInEachColumn(matrix);
    }

    private void sumOfValuesInEachColumn(int[][] matrix) {
        int[] arraySum = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arraySum[j] += matrix[i][j];
            }
        }
        System.out.println("Сумма значений в столбцах: " + Arrays.toString(arraySum));
    }
}
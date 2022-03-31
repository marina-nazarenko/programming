package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix15 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix15 matrix15 = new Matrix15();

        System.out.println("Введите размер x: ");
        int sizeX = scanner.nextInt();
        System.out.println("Введите размер y: ");
        int sizeY = scanner.nextInt();
        int[][] matrix = ArrayUtils.generationMatrix(sizeX, sizeY);

        int maxValue = matrix15.searchForMaxValue(matrix);

        int[][] substitutionOddNumbers = matrix15.substitutionOddNumbers(matrix, maxValue);
        System.out.println("\nМатрица, после замены всех нечетных элементов на максимальное значение: ");
        ArrayUtils.printMatrix(substitutionOddNumbers);
    }

    private int[][] substitutionOddNumbers(int[][] matrix, int maxValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxValue;
                }
            }
        }

        return matrix;
    }

    private int searchForMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                }
            }
        }

        return maxValue;
    }
}
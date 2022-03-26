package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix10 matrix10 = new Matrix10();
        System.out.println("Введите размер квадратной матрицы: ");
        int size = scanner.nextInt();
        int[][] matrix = ArrayUtils.generationSquareMatrixWithNegativeValues(size);
        System.out.println("Положительные элементы, стоящие на главной диагонали в матрице: ");
        matrix10.outputDiagonalElements(matrix);
        System.out.println("Отдельно положительные элементы: ");
        matrix10.outputMainDiagonal(matrix);
    }

    private void outputMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }

    private void outputDiagonalElements(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j || matrix[i][j] < 0) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
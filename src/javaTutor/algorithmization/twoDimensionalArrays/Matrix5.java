package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix5 matrix5 = new Matrix5();
        System.out.println("Введите размер квадратной матрицы: ");
        int n = scanner.nextInt();
        int[][] matrix = matrix5.creationMatrix(n);
        System.out.println("Данная матрица: ");
        ArrayUtils.printMatrix(matrix);

        int[][] matrixV2 = matrix5.creationMatrixV2(n);
        System.out.println("Зеркальная матрица: ");
        ArrayUtils.printMatrix(matrixV2);
    }

    private int[][] creationMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                matrix[i][j] = i + 1;
            }
        }

        return matrix;
    }

    private int[][] creationMatrixV2(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - i - 1; j < matrix[i].length; j++) {
                matrix[i][j] = matrix.length - i;
            }
        }

        return matrix;
    }
}
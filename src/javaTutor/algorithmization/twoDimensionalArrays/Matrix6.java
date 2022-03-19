package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix6 matrix6 = new Matrix6();
        System.out.println("Введите размер квадратной матрицы: ");
        int n = scanner.nextInt();
        int[][] matrix = matrix6.creationMatrix(n);
        System.out.println("Данная матрица: ");
        ArrayUtils.printMatrix(matrix);
    }

    private int[][] creationMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < matrix[i].length - i; j++) {
                matrix[i][j] = 1;
                matrix[n - 1 - i][j] = 1;
            }
        }

        return matrix;
    }

    private int[][] creationMatrixV2(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            if (i < n / 2) {
                for (int j = i; j < matrix[i].length - i; j++) {
                    matrix[i][j] = 1;
                }
            } else {
                for (int j = n - i - 1; j < i + 1; j++) {
                    matrix[i][j] = 1;
                }
            }
        }

        return matrix;
    }
}
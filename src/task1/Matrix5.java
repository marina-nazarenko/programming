package task1;

import java.util.Scanner;

public class Matrix5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix5 matrix5 = new Matrix5();
        System.out.println("Введите размер квадратной матрицы: ");
        int n = scanner.nextInt();
        matrix5.creationMatrix(n);
        matrix5.creationMatrixV2(n);
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private void creationMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                matrix[i][j] = i + 1;
            }
        }
        System.out.println("Данная матрица: ");
        printMatrix(matrix);
    }

    private void creationMatrixV2(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - i - 1; j < matrix[i].length; j++) {
                matrix[i][j] = matrix.length - i;
            }
        }
        System.out.println("Зеркальная матрица: ");
        printMatrix(matrix);
    }
}
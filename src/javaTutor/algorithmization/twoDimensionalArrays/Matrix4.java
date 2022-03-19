package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix4 matrix4 = new Matrix4();
        System.out.println("Введите размер квадратной матрицы: ");
        int n = scanner.nextInt();
        int[][] matrix = matrix4.creationMatrix(n);
        System.out.println("Данная матрица: ");
        ArrayUtils.printMatrix(matrix);
    }

    private int[][] creationMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = matrix.length - j;
                }
            }
        }

        return matrix;
    }
}
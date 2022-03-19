package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix7 matrix7 = new Matrix7();
        System.out.println("Введите размер квадратной матрицы: ");
        int n = scanner.nextInt();
        double[][] matrix = matrix7.creationMatrix(n);
        System.out.println("Данная матрица: ");
        ArrayUtils.printMatrix(matrix);
    }

    private double[][] creationMatrix(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
            }
        }

        return matrix;
    }
}
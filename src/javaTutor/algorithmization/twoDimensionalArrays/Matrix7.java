package javaTutor.algorithmization.twoDimensionalArrays;

import java.util.Scanner;

public class Matrix7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix7 matrix7 = new Matrix7();
        System.out.println("Введите размер квадратной матрицы: ");
        int n = scanner.nextInt();
        double[][] matrix = matrix7.creationMatrix(n);
        System.out.println("Данная матрица: ");
        matrix7.printMatrix(matrix);
        System.out.println("Количество положительных элементов: ");
        int result = matrix7.countPositiveValues(matrix);
        System.out.println(result);
    }

    private void printMatrix(double[][] matrix) {
        for (double[] doubles : matrix) {
            for (double anDoubles : doubles) {
                System.out.printf("%.2f ", anDoubles);
            }
            System.out.println(" ");
        }
    }

    private int countPositiveValues(double[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
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
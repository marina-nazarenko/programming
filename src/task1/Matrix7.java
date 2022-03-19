package task1;

import java.util.Scanner;

public class Matrix7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix7 matrix7 = new Matrix7();
        System.out.println("Введите размер квадратной матрицы: ");
        int n = scanner.nextInt();
        matrix7.creationMatrix(n);
    }

    private void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String result = String.format("%.2f", matrix[i][j]);
                System.out.print(result + " ");
            }
            System.out.println(" ");
        }
    }

    private void creationMatrix(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
            }
        }
        System.out.println("Данная матрица: ");
        printMatrix(matrix);
    }
}
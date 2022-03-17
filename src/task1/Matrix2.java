package task1;

import java.util.Scanner;

public class Matrix2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix2 matrix2 = new Matrix2();
        System.out.println("Введите размер квадратной матрицы: ");
        int size = scanner.nextInt();
        int[][] matrix = matrix2.generationMatrix(size);
        System.out.println("Элементы, стоящие на диагонали: ");
        matrix2.outputDiagonalElements(matrix);
        System.out.println("Элементы, стоящие на главной диагонали: ");
        matrix2.outputMainDiagonal(matrix);
        System.out.println("\nЭлементы, стоящие на второстепенной диагонали: ");
        matrix2.outputSecondaryDiagonal(matrix);
    }

    private void outputSecondaryDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - i - 1] + " ");
        }
    }

    private void outputMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }

    private void outputDiagonalElements(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && i + j != matrix.length - 1) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private int[][] generationMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 9);
            }
        }
        System.out.println("Данная матрица: ");
        printMatrix(matrix);

        return matrix;
    }
}

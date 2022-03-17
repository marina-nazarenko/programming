package task1;

import java.util.Scanner;

public class Matrix1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix1 matrix1 = new Matrix1();
        System.out.println("Введите размер x: ");
        int sizeX = scanner.nextInt();
        System.out.println("Введите размер y: ");
        int sizeY = scanner.nextInt();
        int[][] matrix = matrix1.generationMatrix(sizeX, sizeY);
        System.out.println("Новая матрица: ");
        matrix1.oddColumnsWhoseFirstElementIsGreaterThanTheLast(matrix);
    }

    private void oddColumnsWhoseFirstElementIsGreaterThanTheLast(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j])
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private void oddColumnsWhoseFirstElementIsGreaterThanTheLastV2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i += 2) {
            if (matrix[i][0] > matrix[i][matrix[i].length - 1]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(" ");
            }
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

    private int[][] generationMatrix(int sizeX, int sizeY) {
        int[][] matrix = new int[sizeY][sizeX];
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
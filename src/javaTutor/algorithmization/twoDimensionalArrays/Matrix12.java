package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix12 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Matrix12 matrix12 = new Matrix12();
        System.out.println("Введите размер x: ");
        int sizeX = scanner.nextInt();
        System.out.println("Введите размер y: ");
        int sizeY = scanner.nextInt();
        int[][] matrix = ArrayUtils.generationMatrix(sizeX, sizeY);

        System.out.println("Отсортированные строки матрицы по возрастанию значений элементов: ");
        int[][] sortingAscending = matrix12.sortAsc(matrix);
        ArrayUtils.printMatrix(sortingAscending);

        System.out.println("Отсортированные строки матрицы по убыванию значений элементов: ");
        int[][] sortingDescending = matrix12.sortDesc(matrix);
        ArrayUtils.printMatrix(sortingDescending);
    }

    private int[][] sortAsc(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int n = 0;
            while (n < matrix[i].length) {
                int min = matrix[i][n];
                int index = n;
                for (int j = n; j < matrix[i].length; j++) {
                    if (min > matrix[i][j]) {
                        min = matrix[i][j];
                        index = j;
                    }
                }
                int temp = matrix[i][index];
                matrix[i][index] = matrix[i][n];
                matrix[i][n] = temp;
                n++;
            }
        }

        return matrix;
    }

    private int[][] sortDesc(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int n = 0;
            while (n < matrix[i].length) {
                int min = matrix[i][n];
                int index = n;
                for (int j = n; j < matrix[i].length; j++) {
                    if (min < matrix[i][j]) {
                        min = matrix[i][j];
                        index = j;
                    }
                }
                int temp = matrix[i][index];
                matrix[i][index] = matrix[i][n];
                matrix[i][n] = temp;
                n++;
            }
        }

        return matrix;
    }
}
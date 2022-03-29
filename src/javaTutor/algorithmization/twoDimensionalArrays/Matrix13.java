package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix13 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Matrix13 matrix13 = new Matrix13();
        System.out.println("Введите размер x: ");
        int sizeX = scanner.nextInt();
        System.out.println("Введите размер y: ");
        int sizeY = scanner.nextInt();
        int[][] matrix = ArrayUtils.generationMatrix(sizeX, sizeY);

        System.out.println("Отсортированные столбцы матрицы по возрастанию значений элементов: ");
        int[][] sortingAscending = matrix13.sortAsc(matrix);
        ArrayUtils.printMatrix(sortingAscending);

        System.out.println("Отсортированные столбцы матрицы по убыванию значений элементов: ");
        int[][] sortingDescending = matrix13.sortDesc(matrix);
        ArrayUtils.printMatrix(sortingDescending);
    }

    private int[][] sortAsc(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int n = 0;
            while (n < matrix.length) {
                int min = matrix[n][i];
                int index = n;
                for (int j = n; j < matrix.length; j++) {
                    if (min > matrix[j][i]) {
                        min = matrix[j][i];
                        index = j;
                    }
                }
                int temp = matrix[index][i];
                matrix[index][i] = matrix[n][i];
                matrix[n][i] = temp;
                n++;
            }
        }

        return matrix;
    }

    private int[][] sortDesc(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int n = 0;
            while (n < matrix.length) {
                int min = matrix[n][i];
                int index = n;
                for (int j = n; j < matrix.length; j++) {
                    if (min < matrix[j][i]) {
                        min = matrix[j][i];
                        index = j;
                    }
                }
                int temp = matrix[index][i];
                matrix[index][i] = matrix[n][i];
                matrix[n][i] = temp;
                n++;
            }
        }

        return matrix;
    }
}
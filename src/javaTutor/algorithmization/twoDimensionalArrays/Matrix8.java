package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix8 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix8 matrix8 = new Matrix8();

        System.out.println("Введите размер x: ");
        int sizeX = scanner.nextInt();
        System.out.println("Введите размер y: ");
        int sizeY = scanner.nextInt();
        int[][] matrix = ArrayUtils.generationMatrix(sizeX, sizeY);

        System.out.println("Ведите номер 1-го столбца для обмена: ");
        int st1 = scanner.nextInt();
        System.out.println("Ведите номер 2-го столбца для обмена: ");
        int st2 = scanner.nextInt();

        System.out.println("Новая матрица: ");
        matrix8.columnExchange(matrix, st1, st2);
    }

    private void columnExchange(int[][] matrix, int st1, int st2) {
        for (int i = 0; i < matrix.length; i++) {
            int[] array = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == st1 - 1) {
                    array[j] = matrix[i][st1 - 1];
                    matrix[i][j] = matrix[i][st2 - 1];
                }
                if (j == st2 - 1) {
                    matrix[i][j] = array[st1 - 1];
                }
            }
        }
        ArrayUtils.printMatrix(matrix);
    }
}
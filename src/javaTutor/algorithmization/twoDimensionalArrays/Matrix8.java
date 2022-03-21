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
        int firstColumn = scanner.nextInt();
        System.out.println("Ведите номер 2-го столбца для обмена: ");
        int secondColumn = scanner.nextInt();

        System.out.println("Новая матрица: ");
        int[][] exchangedMatrix = matrix8.columnExchange(matrix, firstColumn, secondColumn);
        ArrayUtils.printMatrix(exchangedMatrix);
    }

    private int[][] columnExchange(int[][] matrix, int firstColumn, int secondColumn) {
        int j1 = firstColumn - 1;
        int j2 = secondColumn - 1;
        for (int i = 0; i < matrix.length; i++) {
            int[] array = matrix[i];
            int temp = array[j1];
            array[j1] = array[j2];
            array[j2] = temp;
        }

        return matrix;
    }
}
package task1;

import java.util.Scanner;

public class Matrix3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix3 matrix3 = new Matrix3();

        System.out.println("Введите размер x: ");
        int sizeX = scanner.nextInt();
        System.out.println("Введите размер y: ");
        int sizeY = scanner.nextInt();

        int[][] matrix = matrix3.generationMatrix(sizeX, sizeY);

        System.out.println("Введите k для вывода строки: ");
        int k = scanner.nextInt();
        System.out.println("Вывод k-ой строки: ");
        matrix3.outputLine(matrix, k);
        System.out.println("\nВведите p для вывода столбца: ");
        int p = scanner.nextInt();
        System.out.println("Вывод p-го столбца: ");
        matrix3.outputColumn(matrix, p);
    }

    private void outputColumn(int[][] matrix, int p) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.println(matrix[j][p - 1]);
        }
    }

    private void outputLine(int[][] matrix, int k) {
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[k - 1][i] + " ");
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
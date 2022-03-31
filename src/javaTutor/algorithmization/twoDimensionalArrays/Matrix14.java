package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.Scanner;

public class Matrix14 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix14 matrix14 = new Matrix14();
        matrix14.matrixOutputWithCheck();
    }

    private void matrixOutputWithCheck() {
        boolean flag = true;
        while (flag) {
            System.out.println("\nВведите количество столбцов: ");
            int sizeM = scanner.nextInt();
            System.out.println("Введите количество строк: ");
            int sizeN = scanner.nextInt();
            int[][] matrix = new int[sizeN][sizeM];

            if (sizeM > sizeN) {
                System.out.println("По условию задачи количество строк должно быть больше либо равно количеству столбцов!");
                System.out.println("-------------------------------------------------------------------------------------");
            } else {
                flag = false;
                int[][] generationRandomMatrix = generationRandomMatrix(matrix, sizeM);
                ArrayUtils.printMatrix(generationRandomMatrix);
            }
        }
    }

    private int[][] generationRandomMatrix(int[][] matrix, int sizeM) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int k = 0; k < i + 1; k++) {
                boolean flag = true;
                while (flag) {
                    int j = (int) (Math.random() * sizeM);
                    if (matrix[j][i] == 0) {
                        matrix[j][i] = 1;
                        flag = false;
                    }
                }
            }
        }

        return matrix;
    }
}
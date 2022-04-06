package javaTutor.utils;

import java.util.Arrays;

public class ArrayUtils {

    /**
     * Generation random array in range from 0 to 10.
     *
     * @param size - size of array
     * @return array
     */
    public static int[] generationArray(int size) {
        int[] array = new int[size];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 10);
        }
        System.out.println("Данный массив: " + Arrays.toString(array) + " ");
        return array;
    }

    /**
     * Generation random matrix with high X and wight Y.
     *
     * @param sizeX - length i
     * @param sizeY - length j
     * @return matrix
     */
    public static int[][] generationMatrix(int sizeX, int sizeY) {
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

    /**
     * Generation random matrix with high X and wight Y.
     *
     * @param sizeX - length i
     * @param sizeY - length j
     * @return matrix
     */
    public static int[][] generationMatrixWithNegativeValues(int sizeX, int sizeY) {
        int[][] matrix = new int[sizeY][sizeX];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 19) - 9;
            }
        }
        System.out.println("Данная матрица: ");
        printMatrix(matrix);

        return matrix;
    }

    /**
     * Generation random square matrix.
     *
     * @param size - size of matrix
     * @return square matrix
     */
    public static int[][] generationSquareMatrix(int size) {
        return generationMatrix(size, size);
    }

    /**
     * Generation random square matrix.
     *
     * @param size - size of matrix
     * @return square matrix
     */
    public static int[][] generationSquareMatrixWithNegativeValues(int size) {
        return generationMatrixWithNegativeValues(size, size);
    }

    /**
     * Print int matrix.
     *
     * @param matrix matrix
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (String.valueOf(anInt).toCharArray().length == 1) {
                    System.out.print(anInt + "  ");
                } else {
                    System.out.print(anInt + " ");
                }
            }
            System.out.println(" ");
        }
    }

    /**
     * Print double matrix.
     *
     * @param matrix matrix
     */
    public static void printMatrix(double[][] matrix) {
        for (double[] doubles : matrix) {
            for (double anDoubles : doubles) {
                System.out.print(anDoubles + " ");
            }
            System.out.println(" ");
        }
    }
}

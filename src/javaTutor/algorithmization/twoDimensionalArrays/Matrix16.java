package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

import java.util.*;

public class Matrix16 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix16 matrix16 = new Matrix16();

        System.out.println("Введите размер матрицы: ");
        int size = scanner.nextInt();

        if (size <= 2) {
            System.out.println("Минимальное число 3!");
        } else {
            int[][] magicMatrix = matrix16.generateMagicMatrix(size);

            System.out.printf("Магический квадрат размером %s :%n", size);
            ArrayUtils.printMatrix(magicMatrix);

            matrix16.checkMagicMatrix(magicMatrix);
        }
    }

    private void checkMagicMatrix(int[][] magicMatrix) {
        Set<Integer> set = new HashSet<>();

        int sumMainDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int i = 0; i < magicMatrix.length; i++) {
            // diagonals
            sumMainDiagonal += magicMatrix[i][i];
            sumSecondDiagonal += magicMatrix[i][magicMatrix.length - 1 - i];

            // columns and rows
            int sumRows = 0;
            int sumColumns = 0;
            for (int j = 0; j < magicMatrix.length; j++) {
                sumRows += magicMatrix[i][j];
                sumColumns += magicMatrix[j][i];
            }
            set.add(sumRows);
            set.add(sumColumns);
        }
        set.add(sumMainDiagonal);
        set.add(sumSecondDiagonal);

        System.out.println("Магическое число - " + set);
    }

    private int[][] generateMagicMatrix(int size) {
        if (size % 2 != 0) {
            return generateOddMatrix(size);
        } else if (size % 4 == 0) {
            return generateEvenDoubleMatrix(size);
        } else {
            return generateEvenMatrix(size);
        }
    }

    private int[][] generateEvenMatrix(int size) {
        int[][] magicMatrix = new int[size][size];
        int[][] matrix = generateOddMatrix(size / 2);

        for (int i = 0; i < magicMatrix.length / 2; i++) {
            for (int j = 0; j < magicMatrix[i].length / 2; j++) {
                magicMatrix[i][j] = matrix[i][j];
                magicMatrix[i + size / 2][j + size / 2] = matrix[i][j] + size * size / 4;
                magicMatrix[i][j + size / 2] = matrix[i][j] + size * size / 2;
                magicMatrix[i + size / 2][j] = matrix[i][j] + size * size / 4 * 3;
            }
        }

        for (int i = 0; i < magicMatrix.length / 2; i++) {
            if (i == 0 || i == magicMatrix.length / 2 - 1) {
                magicMatrix[i][0] = magicMatrix[i][0] + size * size / 4 * 3;
                magicMatrix[i + size / 2][0] = magicMatrix[i][0] - size * size / 4 * 3;
            } else {
                magicMatrix[i][1] = magicMatrix[i][1] + size * size / 4 * 3;
                magicMatrix[i + size / 2][1] = magicMatrix[i][1] - size * size / 4 * 3;
            }

            int count = (size - 6) / 4;
            for (int j = 0; j < count; j++) {
                magicMatrix[i][size / 2 - j - 1] = magicMatrix[i][size / 2 - j - 1] + size * size / 4 * 3;
                magicMatrix[i + size / 2][size / 2 - j - 1] = magicMatrix[i + size / 2][size / 2 - j - 1] - size * size / 4 * 3;

                magicMatrix[i][size / 2 + j] = magicMatrix[i][size / 2 + j] - size * size / 4;
                magicMatrix[i + size / 2][size / 2 + j] = magicMatrix[i + size / 2][size / 2 + j] + size * size / 4;
            }
        }

        return magicMatrix;
    }

    private int[][] generateEvenDoubleMatrix(int size) {
        int last = size * size;
        int[][] magicMatrix = new int[size][size];
        for (int i = 0; i < magicMatrix.length; i++) {
            for (int j = 0; j < magicMatrix[i].length; j++) {
                if (isEvenValue(i, j, size)) {
                    magicMatrix[i][j] = size * i + j + 1;
                } else {
                    magicMatrix[i][j] = last - size * i - j;
                }
            }
        }

        return magicMatrix;
    }

    private boolean isEvenValue(int i, int j, int size) {
        int iBasic = i - (int) Math.floor(i / 4) * 4;
        int jBasic = j - (int) Math.floor(j / 4) * 4;

        return iBasic == jBasic || iBasic + jBasic == 3;
    }

    private int[][] generateOddMatrix(int size) {
        int[][] matrix = new int[size][size];

        boolean flag = true;
        int count = 1;
        int y = 0;
        int x = matrix.length / 2;
        while (flag) {
            matrix[y][x] = count++;

            if (y == 0 && x >= size - 1 && matrix[size - 1][0] != 0) {
                y++;
            } else {
                y--;
                if (y < 0) {
                    y = size - 1;
                }
                x++;
                if (x == size) {
                    x = 0;
                }
                if (matrix[y][x] != 0) {
                    y += 2;
                    x--;
                }
            }

            if (count == size * size + 1) {
                flag = false;
            }
        }

        return matrix;
    }
}
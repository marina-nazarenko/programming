package javaTutor.algorithmization.twoDimensionalArrays;

import javaTutor.utils.ArrayUtils;

public class Matrix11 {

    public static void main(String[] args) {
        Matrix11 matrix11 = new Matrix11();
        int sizeX = 20;
        int sizeY = 10;
        int[][] matrix = matrix11.generationMatrix(sizeX, sizeY);
        String array = matrix11.findLinesWithNumberFive(matrix);
        System.out.println("Номера строк, в которых цифра 5 встречается 3 и более раз: ");
        matrix11.outputResult(array);
    }

    private void outputResult(String array){
        if (array.equals("")) {
            System.out.println("Нет таких строк!");
        } else {
            System.out.println(array);
        }
    }

    private String findLinesWithNumberFive(int[][] matrix) {
        StringBuilder array = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                array.append(i + 1).append(" ");
            }
        }

        return array.toString();
    }

    private int[][] generationMatrix(int sizeX, int sizeY) {
        int[][] matrix = new int[sizeY][sizeX];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
        System.out.println("Данная матрица: ");
        ArrayUtils.printMatrix(matrix);

        return matrix;
    }
}
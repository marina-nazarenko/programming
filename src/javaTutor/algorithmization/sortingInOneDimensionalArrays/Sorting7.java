package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import java.util.Arrays;

public class Sorting7 {

    public static void main(String[] args) {
        Sorting7 sorting7 = new Sorting7();

        int[] arrayOne = {1, 3, 5, 8, 9};
        System.out.println("Первая последовательность:" + Arrays.toString(arrayOne));

        int[] arrayTwo = {2, 4, 7, 10, 15, 17};
        System.out.println("Вторая последовательность:" + Arrays.toString(arrayTwo));

        sorting7.searchForInsertionPoints(arrayOne, arrayTwo);
    }

    private void searchForInsertionPoints(int[] arrayOne, int[] arrayTwo) {
        int[] newArray = new int[arrayOne.length + arrayTwo.length];

        int mOne = 0;
        int nTwo = 0;
        int i = 0;

        while (i < newArray.length) {
            while (mOne < arrayOne.length && nTwo < arrayTwo.length) {
                if (arrayOne[mOne] <= arrayTwo[nTwo]) {
                    newArray[i++] = arrayOne[mOne++];
                } else {
                    newArray[i++] = arrayTwo[nTwo++];
                    System.out.println("Число " + arrayTwo[nTwo - 1] + " - место " + (i - 1));
                }
            }

            if (nTwo == arrayTwo.length) {
                newArray[i++] = arrayOne[mOne++];
            } else {
                newArray[i++] = arrayTwo[nTwo++];
                System.out.println("Число " + arrayTwo[nTwo - 1] + " - место " + (i - 1));
            }
        }
    }
}
package javaTutor.algorithmization.oneDimensionalArrays;

import java.util.Arrays;

public class Alg4 {
    public static void main(String[] args) {
        Alg4 alg4 = new Alg4();
        alg4.minMaxReplacement();

    }
    private void minMaxReplacement() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(a));
        int max = a[0];
        int iMax = 0;
        int min = a[0];
        int iMin = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                iMax = i;
            }
            if (a[i] < min) {
                min = a[i];
                iMin = i;
            }
        }
        a[iMin] = max;
        a[iMax] = min;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
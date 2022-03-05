package task1;

import java.util.Arrays;

public class Alg4 {
    public static void main(String[] args) {
        Alg4 alg4 = new Alg4();
        alg4.replacement();

    }

    private void replacement() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = a[0];
        int imax = 0;
        int min = a[0];
        int imin = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                imax = i;
            }
            if (a[i] < min) {
                min = a[i];
                imin = i;
            }
        }
        a[imin] = max;
        a[imax] = min;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}





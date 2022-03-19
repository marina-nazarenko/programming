package javaTutor.algorithmization.oneDimensionalArrays;

import java.util.Scanner;


public class Alg1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Alg1 alg1 = new Alg1();

        System.out.println("Введите K:");
        int k = scanner.nextInt();

        alg1.arrayA(k);
    }

    private void arrayA(int k) {
        int s = 0;
        int[] a = new int[]{6, 25, 43, 25, 14, 35, 5, 12, 34};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                s += a[i];
            }
        }
        System.out.println("Сумма, кратная числу " + k + " = " + s);
    }
}



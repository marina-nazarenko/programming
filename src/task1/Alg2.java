package task1;

import java.util.Scanner;

public class Alg2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Alg2 alg2 = new Alg2();
        System.out.println("Введите Z:");
        int z = scanner.nextInt();

        alg2.replacement(z);

    }

    private void replacement(int z) {
        int nArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Последовательность чисел с учетом изменений:");
        for (int i = 0; i < nArray.length; i++) {
            if (nArray[i] > z) {
                nArray[i] = z;
            }
            System.out.print(nArray[i] + " ");
        }
    }


}

package javaTutor.algorithmization.oneDimensionalArrays;

import javaTutor.utils.ArrayUtils;
import java.util.Scanner;

public class ALg6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ALg6 alg6 = new ALg6();
        System.out.println("Введите N:");
        int n = scanner.nextInt();
        int[] array = ArrayUtils.generationArray(n);
        int result = alg6.findSumOfNumbersWithIndexSimpleValue(array);
        System.out.println(result);
    }

    private int findSumOfNumbersWithIndexSimpleValue(int[] array) {
        int s = 0;
        for (int i = 2; i < array.length; i++) {
            if (isIndexSimpleValue(i)) {
                s += array[i];
            }
        }
        return s;
    }

    private boolean isIndexSimpleValue(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}
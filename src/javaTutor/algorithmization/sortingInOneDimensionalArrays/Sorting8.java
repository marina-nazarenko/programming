package javaTutor.algorithmization.sortingInOneDimensionalArrays;

import java.util.Scanner;

public class Sorting8 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sorting8 sorting8 = new Sorting8();

        System.out.println("Введите колличество дробей:");
        int n = scanner.nextInt();
        int[] arrayP = sorting8.generationArray(n, 0, 10);
        int[] arrayQ = sorting8.generationArray(n, 1, 10);

        System.out.println("\nНачальные дроби: ");
        sorting8.printingOfInitialFractions(arrayP, arrayQ, n);

        int maxDenominator = sorting8.findingMaxDenominator(arrayQ, n);
        int commonDenominator = sorting8.findingCommonDenominator(arrayQ, n, maxDenominator);

        System.out.println("\n\nОбщий знаменатель - " + commonDenominator);

        int[] newArrayP = sorting8.reductionToCommonDenominator(arrayP, arrayQ, n, commonDenominator);
        int[] sortingNewArrayQ = sorting8.sortingOfReducedDenominator(arrayQ, n, commonDenominator);
        System.out.println("\nПриведенные к общему знаменателю дроби: ");
        sorting8.printingOfInitialFractions(newArrayP, sortingNewArrayQ, n);

        int[] sortingNewArrayP = sorting8.sortingOfReducedFractions(arrayP);

        System.out.println("\n\nОтсортированные дроби: ");
        sorting8.printingOfInitialFractions(sortingNewArrayP, sortingNewArrayQ, n);

    }

    private int[] generationArray(int n, int a, int b) {
        int[] array = new int[n];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * (b - a)) + a;
        }

        return array;
    }

    private void printingOfInitialFractions(int[] arrayP, int[] arrayQ, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arrayP[i] + "/" + arrayQ[i] + " ");
        }
    }

    private int findingMaxDenominator(int[] arrayQ, int n) {
        int maxDenominator = arrayQ[0];
        for (int i = 0; i < n; i++) {
            if (arrayQ[i] > maxDenominator) {
                maxDenominator = arrayQ[i];
            }
        }

        return maxDenominator;
    }

    private int findingCommonDenominator(int[] arrayQ, int n, int maxDenominator) {
        int commonDenominator = maxDenominator;
        int i = 0;

        while (i < n) {
            for (int j = 0; j < n; j++) {
                if (commonDenominator % arrayQ[j] == 0) {
                    i++;
                } else {
                    commonDenominator += maxDenominator;
                    i = 0;
                    break;
                }
            }
        }

        return commonDenominator;
    }

    private int[] reductionToCommonDenominator(int[] arrayP, int[] arrayQ, int n, int commonDenominator) {
        for (int i = 0; i < n; i++) {
            arrayP[i] = arrayP[i] * commonDenominator / arrayQ[i];
        }

        return arrayP;
    }

    private int[] sortingOfReducedFractions(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int flag = array[i];
            int j = i - 1;
            while (j >= 0 && flag < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = flag;
        }

        return array;
    }

    private int[] sortingOfReducedDenominator(int[] newArrayQ, int n, int commonDenominator) {
        for (int i = 0; i < n; i++) {
            newArrayQ[i] = commonDenominator;
        }

        return newArrayQ;
    }
}
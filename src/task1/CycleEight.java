package task1;

import java.util.Scanner;

public class CycleEight {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CycleEight cycleEight = new CycleEight();
        System.out.println("Введите m:");
        int m = scanner.nextInt();
        System.out.println("Введите n:");
        int n = scanner.nextInt();

        cycleEight.calculate(m, n);
    }

    private void calculate(int m, int n) {
        String strM = Integer.toString(m);
        String strN = Integer.toString(n);
        char[] charArrayM = strM.toCharArray();
        char[] charArrayN = strN.toCharArray();

        for (char charM : charArrayM) {
            for (char charN : charArrayN) {
                if (charM == charN) {
                    System.out.println(charM);
                }
            }
        }
    }
}

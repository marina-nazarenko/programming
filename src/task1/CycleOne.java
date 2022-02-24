package task1;

import java.util.Scanner;

public class CycleOne {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CycleOne cycleOne = new CycleOne();
        System.out.println("Введите x:");
        int x = scanner.nextInt();

        int result = cycleOne.calculate(x);
        System.out.println(" S = " + result);
    }

    private int calculate(int x) {
        int s = 1;
        int result = 0;
        if (x > 0) {
            while (s <= x) {
                result += s;
                s++;
            }
        } else {
            System.out.println("Ошибка! Введите положительньое число.");
        }

        return result;
    }

}
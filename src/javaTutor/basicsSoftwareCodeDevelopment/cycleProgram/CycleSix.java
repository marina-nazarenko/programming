package javaTutor.basicsSoftwareCodeDevelopment.cycleProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleSix {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CycleSix cycleSix = new CycleSix();
        System.out.println("Введите m:");
        int m = scanner.nextInt();
        System.out.println("Введите n:");
        int n = scanner.nextInt();

        cycleSix.calculateV2(m, n);
    }

    private void calculate(int m, int n) {
        for (int x = m; x <= n; x++) {
            System.out.println("Делители числа " + x + ": ");
            for (int k = 2; k < x; k++) {
                if (x % k == 0) {
                    System.out.println(k);
                }
            }
        }
    }

    private void calculateV2(int m, int n) {
        for (int x = m; x <= n; x++) {
            List<Integer> rememberedNumbers = new ArrayList<>();
            System.out.println("\nДелители числа " + x + ": ");
            for (int k = 2; k < x; k++) {
                if (x % k == 0) {
                    rememberedNumbers.add(k);
                }
            }
            if (rememberedNumbers.isEmpty()) {
                System.out.println("Нет делителей, кроме 1 и " + x);
            } else {
                rememberedNumbers.forEach(System.out::println);
            }
        }
    }

}

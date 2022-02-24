package task1;

import java.util.Scanner;

public class VetvFive {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        VetvFive vetvFive = new VetvFive();
        System.out.println("Введите x:");
        double x = scanner.nextInt();

        double result = vetvFive.calculate(x);
        System.out.println(" F(x) = " + result);
    }

    private double calculate (double x) {
        double f;

        if (x <= 3) {
            f = Math.pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
        }
        return f;

    }

}

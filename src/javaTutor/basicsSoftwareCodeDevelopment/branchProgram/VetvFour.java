package javaTutor.basicsSoftwareCodeDevelopment.branchProgram;

import java.util.Scanner;

public class VetvFour {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите А");
        int a = scanner.nextInt();
        System.out.println("Введите B");
        int b = scanner.nextInt();

        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int z = (int) (Math.random() * 10);
        System.out.println("x = " + x + "\ny = " + y + "\nz = " + z);

        VetvFour taskFour = new VetvFour();
        boolean result = taskFour.result(a, b, x, y, z);
        if (result) {
            System.out.println("Кирпич проходит через отверстие.");
        } else {
            System.out.println("Кирпич НЕ проходит через отверстие.");
        }
    }

    private boolean result(int a, int b, int x, int y, int z) {
        return (x < a && y < b)
                || (x < b && y < a)
                || (y < a && z < b)
                || (y < b && z < a)
                || (x < a && z < b)
                || (x < b && z < a);
    }
}

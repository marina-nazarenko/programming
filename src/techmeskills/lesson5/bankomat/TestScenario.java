package techmeskills.lesson5.bankomat;

import java.util.Scanner;

public class TestScenario {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(100, 3, 2);
        bankomat.printInfoAboutMoneyOnTheBankomat();

        System.out.println("Введите сумму, которую Вы хотите положить в банкомат:");
        int plusMoney = scanner.nextInt();
        bankomat.putMoneyOnTheBankomat(plusMoney);

        System.out.println("\nВведите сумму, которую Вы хотите снять с банкомата:");
        int minusMoney = scanner.nextInt();
        bankomat.getMoneyOnTheBankomat(minusMoney);
    }
}

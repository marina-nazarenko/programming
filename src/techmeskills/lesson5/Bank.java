package techmeskills.lesson5;

import java.util.Scanner;

public class Bank {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard("123AB2", 100);
        CreditCard creditCard2 = new CreditCard("456CD3", 500);
        CreditCard creditCard3 = new CreditCard("789EF4", 30);

        Bank bank = new Bank();
        bank.enterCardNumber(creditCard1, creditCard2, creditCard3);
    }

    public void enterCardNumber(CreditCard creditCard1, CreditCard creditCard2, CreditCard creditCard3) {
        System.out.println("Введите номер карточки: ");
        int creditCardNumber = scanner.nextInt();

        if (creditCardNumber == 1) {
            selectingCardActions(creditCard1);
        }
        if (creditCardNumber == 2) {
            selectingCardActions(creditCard2);
        }
        if (creditCardNumber == 3) {
            selectingCardActions(creditCard3);
        }
    }

    public void selectingCardActions(CreditCard creditCard) {
        while (true) {
            System.out.println("\nВыберите действие с карточкой: \n1 - информация о счете; \n2 - пополнить счет; \n3 - снять деньги.");
            int actionWithCard = scanner.nextInt();

            if (actionWithCard == 1) {
                creditCard.printInfoAboutCreditCard();
            }
            if (actionWithCard == 2) {
                System.out.println("Введите сумму денег:");
                int moneyAdd = scanner.nextInt();
                creditCard.putMoneyOnTheCard(moneyAdd);
            }
            if (actionWithCard == 3) {
                System.out.println("Введите сумму денег:");
                int minusMoney = scanner.nextInt();
                int moneyMinus = creditCard.getMoneyOnTheCard(minusMoney);
                System.out.println("Заберите деньги - " + moneyMinus);
            }
            if (actionWithCard == 0) {
                break;
            }
        }
    }
}
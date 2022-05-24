package techmeskills.lesson5;

public class CreditCard {

    private String accountNumber;
    private int amountOnAccount;

    public CreditCard(String accountNumber, int amountOnAccount) {
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }

    public void putMoneyOnTheCard(int plusMoney) {
        this.amountOnAccount += plusMoney;
    }

    public int getMoneyOnTheCard(int minusMoney) {
        if (minusMoney <= this.amountOnAccount) {
            this.amountOnAccount -= minusMoney;
            System.out.println("Списание прошло успешно, получите сумму - " + minusMoney);
            return minusMoney;
        } else {
            System.out.println("Недостаточно средств на счету!");
            return 0;
        }
    }

    public void printInfoAboutCreditCard() {
        System.out.println("Номер счета - " + this.accountNumber);
        System.out.println("Текущий счет - " + this.amountOnAccount);
    }
}

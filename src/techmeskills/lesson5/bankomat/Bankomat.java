package techmeskills.lesson5.bankomat;

public class Bankomat {

    int numberOfBanknotesDenomination20;
    int numberOfBanknotesDenomination50;
    int numberOfBanknotesDenomination100;

    public Bankomat(int numberOfBanknotesDenomination20, int numberOfBanknotesDenomination50, int numberOfBanknotesDenomination100) {
        this.numberOfBanknotesDenomination20 = numberOfBanknotesDenomination20;
        this.numberOfBanknotesDenomination50 = numberOfBanknotesDenomination50;
        this.numberOfBanknotesDenomination100 = numberOfBanknotesDenomination100;
    }

    public void putMoneyOnTheBankomat(int plusMoney) {
        if (checkOfBanknoteDenomination(plusMoney)) {
            System.out.println("Данная операция прошла успешно!");

            int numberOf100 = plusMoney / 100;
            int remainderOf100 = plusMoney % 100;
            int numberOf50 = remainderOf100 / 50;
            int remainderOf50 = remainderOf100 % 50;
            int numberOf20 = remainderOf50 / 20;

            this.numberOfBanknotesDenomination20 += numberOf20;
            this.numberOfBanknotesDenomination50 += numberOf50;
            this.numberOfBanknotesDenomination100 += numberOf100;
            printInfoAboutMoneyOnTheBankomat();
        } else {
            System.out.println("Банкомат не может принять купюры данного номинала!");
            printInfoAboutMoneyOnTheBankomat();
        }
    }

    public boolean getMoneyOnTheBankomat(int minusMoney) {

        int numberOf100 = minusMoney / 100 - (minusMoney / 100 - this.numberOfBanknotesDenomination100) * checkBanknotesDenomination100(minusMoney);
        int remainderOf100 = minusMoney % 100;
        int numberOf50 = (remainderOf100 + numberOf100 * 100) / 50 - ((remainderOf100 + numberOf100 * 100) / 50 - this.numberOfBanknotesDenomination50) * checkBanknotesDenomination50(minusMoney) + checkBanknotesDenomination20(minusMoney);
        int remainderOf50 = remainderOf100 % 50;
        int numberOf20 = (remainderOf50 + numberOf50 * 50 + numberOf100 * 100 + checkBanknotesDenomination20(minusMoney) * 50) / 20;

        if (checkOfBanknoteDenomination(minusMoney)) {
            if (sumMoneyOnTheBank() >= minusMoney) {
                this.numberOfBanknotesDenomination20 -= numberOf20;
                this.numberOfBanknotesDenomination50 -= numberOf50;
                this.numberOfBanknotesDenomination100 -= numberOf100;
                System.out.println("Операция прошла успешно! \nВаша сумма денег в размере " + minusMoney + " выдана купюрами номиналов: \n20 - " + numberOf20 + "\n50 - " + numberOf50 + "\n100 - " + numberOf100);
                printInfoAboutMoneyOnTheBankomat();

                return true;
            } else {
                System.out.println("Сейчас в банке нет такой суммы!");
                printInfoAboutMoneyOnTheBankomat();

                return false;
            }
        } else {
            System.out.println("Данную сумму денег банк не может выдать в сзязи с ограничением разнообразия номиналов купюр!");
            printInfoAboutMoneyOnTheBankomat();

            return false;
        }
    }

    public void printInfoAboutMoneyOnTheBankomat() {
        System.out.println("\nНа данный момент в банкомате номиналом \n20 - " + this.numberOfBanknotesDenomination20 + "\n50 - " + this.numberOfBanknotesDenomination50 + "\n100 - " + this.numberOfBanknotesDenomination100);
    }

    public boolean checkOfBanknoteDenomination(int money) {
        int remainderOf100 = money % 100;
        int remainderOf50 = remainderOf100 % 50;
        int remainderOf20 = remainderOf50 % 20;

        if (remainderOf20 == 0) {

            return true;
        }

        return false;
    }

    public int sumMoneyOnTheBank() {
        return this.numberOfBanknotesDenomination20 * 20 + this.numberOfBanknotesDenomination50 * 50 + this.numberOfBanknotesDenomination100 * 100;
    }

    public int checkBanknotesDenomination100(int minusMoney) {
        int checkNumberOf100 = minusMoney / 100;
        if (checkNumberOf100 > this.numberOfBanknotesDenomination100) {
            return 1;
        } else {
            return 0;
        }
    }

    public int checkBanknotesDenomination50(int minusMoney) {
        int checkNumberOf100 = minusMoney / 100 - (minusMoney / 100 - this.numberOfBanknotesDenomination100) * checkBanknotesDenomination100(minusMoney);
        int remainderOf100 = minusMoney % 100;
        int checkNumberOf50 = (remainderOf100 + checkNumberOf100 * 100) / 50;
        if (checkNumberOf50 > this.numberOfBanknotesDenomination50) {
            return 1;
        } else {
            return 0;
        }
    }

    public int checkBanknotesDenomination20(int minusMoney) {
        int checkNumberOf100 = minusMoney / 100 - (minusMoney / 100 - this.numberOfBanknotesDenomination100) * checkBanknotesDenomination100(minusMoney);
        int remainderOf100 = minusMoney % 100;
        int numberOf50 = (remainderOf100 + checkNumberOf100 * 100) / 50 - ((remainderOf100 + checkNumberOf100 * 100) / 50 - this.numberOfBanknotesDenomination50) * checkBanknotesDenomination50(minusMoney);
        if ((numberOf50 * 50) % 20 != 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
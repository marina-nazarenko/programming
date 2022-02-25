package task1;

public class CycleFour {

    private int calculate() {
        int result = 1;
        for (int s = 1; s <= 200; s++) {
            result *= Math.pow(s, 2);
        }
        return result;
    }

    public static void main(String[] args) {
        CycleFour cycleFour1 = new CycleFour();

        int result = cycleFour1.calculate();
        System.out.println(" S = " + result);
    }
}

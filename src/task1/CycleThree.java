package task1;

public class CycleThree {

    public static void main(String[] args) {
        CycleThree cycleThree = new CycleThree();
        int result = cycleThree.calculate();
        System.out.println(" S = " + result);
    }

    private int calculate() {
        int s = 1;
        int result = 0;
        for (s = 0; s <= 100; s++) {
            result += Math.pow(s, 2);

        }
        return result;
    }
}

package task1;

public class VetvTwo {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) - 5;
        int b = (int) (Math.random() * 10) - 5;
        int c = (int) (Math.random() * 10) - 5;
        int d = (int) (Math.random() * 10) - 5;

        System.out.println("max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")}");

        int min1 = findMin(a, b);
        int min2 = findMin(c, d);
        int max = findMax(min1, min2);

        System.out.println("max = " + max);
    }

    private static int findMax(int min1, int min2) {
        int max;
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        return max;
    }

    private static int findMin(int a, int b) {
        int min1;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        return min1;
    }
}

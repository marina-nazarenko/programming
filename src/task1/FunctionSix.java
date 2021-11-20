package task1;

public class FunctionSix {
    public static void main(String[] args) {
        double x = (int) (Math.random() * 10) - 5;
        double y = (int) (Math.random() * 10) - 5;
//        int x = 0;
//        int y = -1;
        System.out.println("x = " + (int) x);
        System.out.println("y = " + (int) y);
        if (x == 0 && y == -1) {
            System.out.println("False");
        } else if ((x > -3 && x < 3 && y >= 0 && y < 5) || (x > -5 && x < 5 && y > -4 && y <= 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

//        if ((x > -3 && x < 3 && y >= 0 && y < 5) || (x > -5 && x < 5 && y > -4 && y <= 0) && !(x == 0 && y == -1)) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
    }
}


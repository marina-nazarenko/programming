package task1;

public class VetvOne {
    public static void main(String[] args) {
        int x = 80;
        int y = 50;
        int z = 90;

        if (x + y + z == 180) {
            System.out.println("Такой треугольник существует");
        } else {
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("и является прямоугольным.");
            }
        }

    }
}

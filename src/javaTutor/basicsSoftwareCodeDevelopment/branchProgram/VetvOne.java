package javaTutor.basicsSoftwareCodeDevelopment.branchProgram;

public class VetvOne {
    public static void main(String[] args) {
        int x = 50;
        int y = 40;
        int z = 90;
        System.out.println("z = " + z);
        if (x + y + z == 180) {
            System.out.println("Такой треугольник существует");
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("и является прямоугольным.");
            }
        } else {
            System.out.println("Такого треугольника не существует!");
        }
    }
}

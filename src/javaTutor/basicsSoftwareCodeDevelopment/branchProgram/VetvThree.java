package javaTutor.basicsSoftwareCodeDevelopment.branchProgram;

public class VetvThree {
    public static void main(String[] args) {
        double x1 = (int) (Math.random() * 10) - 5;
        double y1 = (int) (Math.random() * 10) - 5;
        double x2 = (int) (Math.random() * 10) - 5;
        double y2 = (int) (Math.random() * 10) - 5;
        double x3 = (int) (Math.random() * 10) - 5;
        double y3 = (int) (Math.random() * 10) - 5;

        System.out.println("A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), C(" + x3 + ", " + y3 + ") ");
        if ((x3 - x1) / (y3 - y1) == (x2 - x1) / (y2 - y1)) {
            System.out.println("Данные точки расположены на одной прямой.");
        } else {
            System.out.println("Данные точки не расположены на одной прямой.");
        }
    }
}

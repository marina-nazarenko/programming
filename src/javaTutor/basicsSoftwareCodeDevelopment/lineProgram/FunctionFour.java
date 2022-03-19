package javaTutor.basicsSoftwareCodeDevelopment.lineProgram;

public class FunctionFour {
    public static void main(String[] args) {
        double R = 123.456;
        System.out.println("R = " + R);
        double x = (int) R;
        double y = (R - x) * 1000;
        double Rn = (int)y + x / 1000;
        System.out.println(Rn);
    }
}

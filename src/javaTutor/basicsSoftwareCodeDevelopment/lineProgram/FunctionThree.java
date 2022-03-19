package javaTutor.basicsSoftwareCodeDevelopment.lineProgram;

public class FunctionThree {
    public static void main(String[] args) {
        double f;
        double x = (int) (Math.random() * 10);
        double y = (int) (Math.random() * 10);

        f = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println("(Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);");
        System.out.println("x = " + x + ",   y= " + y + ";");
        System.out.println("f = " + f + ".");
    }
}

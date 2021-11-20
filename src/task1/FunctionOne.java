package task1;

public class FunctionOne {

    public static void main(String[] args) {
        double z;
        double a = (int) (Math.random() * 10);
        double b = (int) (Math.random() * 10);
        double c = (int) (Math.random() * 10);

        z = ((a - 3) * b / 2) + c;
        System.out.println("z = ((a - 3) * b / 2) + c;");
        System.out.println("a = " + a + ",   b = " + b + ",   c= " + c + ";");
        System.out.println("z = " + z + " .");
    }

/*    public static void main(String[] args) {
        // initialize variables for evaluating
        double a = (int) (Math.random() * 10);
        double b = (int) (Math.random() * 10);
        double c = (int) (Math.random() * 10);

        // creating object for FunctionOne
        FunctionOne functionOne = new FunctionOne();

        // execute evaluating using functionOne object
        double z = functionOne.evaluateResult(a, b, c);

        // output result to console
        functionOne.outputResultToConsole(a, b, c, z);
    }

    private void outputResultToConsole(double a, double b, double c, double z) {
        System.out.println("z = ((a - 3) * b / 2) + c;");
        System.out.printf("a = %.1f, b = %.1f, c = %.1f;\n", a, b, c);
        System.out.printf("z = %.1f.", z);
    }

    public double evaluateResult(double val1, double val2, double val3) {
        return ((val1 - 3) * val2/2) + val3;
    }*/
}


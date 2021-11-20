package task1;

public class FunctionTwo {
    public static void main(String[] args) {//-446.1388888888889
        double f;
        double a = 4;//(int) (Math.random() * 10);
        double b = 3;//(int) (Math.random() * 10);
        double c = 7;//(int) (Math.random() * 10);

        f = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("f = (b + (b^2 + 4 * a * c)^(1/2)) / (2 * a) - a^3 * c + b^(-2);");
        System.out.println("a = " + a + ",   b = " + b + ",   c= " + c + ";");
        System.out.println("f = " + f + ".");
    }
}

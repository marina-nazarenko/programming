package javaTutor.programmingWithClasses.simpleClassesAndObjects;

public class Test1 {
    private int a;
    private int b;

    public void printInfo() {
        System.out.println("А - " + this.a + "\nВ - " + this.b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int sumAB() {
        return a + b;
    }

    public int maxValue() {
        return Math.max(a, b);
    }
}

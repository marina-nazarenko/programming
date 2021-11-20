package task1;

public class FoundValueInFunction {
    public static void main(String[] args) {
        var foundValueInFunction = new FoundValueInFunction();
        int result = foundValueInFunction.foundResult(1, 2, 3);
        System.out.println(result);
    }

    public int foundResult(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }

}

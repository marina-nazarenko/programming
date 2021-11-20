public class Main {

    public static void main(String[] args) {
        String hi = "hi";
        String bye = "bye";
        Main main = new Main();

        main.start(hi);
        System.out.println(hi + " hello world " + 5);
        main.start(bye);
    }

    private void start(String value) {
        System.out.printf("%s hello world %d\n", value, 5);
    }
}

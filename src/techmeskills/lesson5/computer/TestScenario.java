package techmeskills.lesson5.computer;

public class TestScenario {

    public static void main(String[] args) {
        Computer computer1 = new Computer("Lenovo", 100);
        computer1.infoAboutСomputer();

        Computer computer2 = new Computer("Lenovo", 100, "kapm", 150, "polf", 200, HddType.INTERNAL);
        computer2.infoAboutСomputer();
    }
}
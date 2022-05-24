package techmeskills.lesson5.computer;

public class Computer {
    private int price;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(String model, int price) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(String model, int price, String nameRam, int volumeRam, String nameHdd, int volumeHdd, HddType typeHdd) {
        this.price = price;
        this.model = model;
        this.ram = new Ram(nameRam, volumeRam);
        this.hdd = new Hdd(nameHdd, volumeHdd, typeHdd);
    }

    public void infoAboutСomputer() {
        System.out.println("Модель компьютера - " + model);
        System.out.println("Цена компьютера - " + price);
        System.out.println(ram.infoAboutRam());
        System.out.println(hdd.infoAboutHdd());
    }
}

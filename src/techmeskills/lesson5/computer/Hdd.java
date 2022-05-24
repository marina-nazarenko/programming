package techmeskills.lesson5.computer;

public class Hdd {
    private String name;
    private int volume;
    private HddType type;

    public Hdd() {
    }

    public Hdd(String name, int volume, HddType type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public String infoAboutHdd(){
        String infoAboutHdd = "Название HDD - " + name + "\nОбъем HDD - " + volume + "\nТип HDD - " + volume;

        return infoAboutHdd;
    }
}

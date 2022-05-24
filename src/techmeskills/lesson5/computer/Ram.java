package techmeskills.lesson5.computer;

public class Ram {
    private String name;
    private int volume;

    public Ram() {
    }

    public Ram(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String infoAboutRam(){
        String infoAboutRam = "Название RAM - " + name + "\nОбъем RAM - " + volume;

        return infoAboutRam;
    }
}

package task1;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 10;
        String word;
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            } else if (beerNum < 5) {
                word = "бутылки";
            } else {
                word = "бутылок";
            }
            System.out.println(beerNum + " " + word + " пива на стене,");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;

        }
        System.out.println("Нет бутылок пива на стене");
    }
}

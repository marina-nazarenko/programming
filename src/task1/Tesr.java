package task1;

public class Tesr {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5){
            if (y < 5){
                x++;
                if (y < 3){
                    x--;
                }
            }
            y = y +2;

            System.out.println(x + "" + y + " ");
            x++;
        }
    }
}

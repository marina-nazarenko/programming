package javaTutor.basicsSoftwareCodeDevelopment.lineProgram;

public class FunctionFive {
    public static void main(String[] args) {
//        double T = (int) (Math.random() * 100000);
//        int T = 57783;
//        int H = (int) T / 3600;
//        int M = ((int) T - H * 3600) / 60;
//        int S = (int) T - H * 3600 - M * 60;
//        System.out.println("T: " + (int) T);
//        System.out.print(H + "ч " + M + "мин " + S + "с");
//        double T = (int) (Math.random() * 100000);
//        int T = 57783003;
//        int D = (int) T / 86400;
//        int H = (int) (T - D * 86400) / 3600;
//        int M = (int) (T - D * 86400 - H * 3600) / 60;
//        int S = (int) T - D * 86400 - H * 3600 - M * 60;
//        System.out.println("T: " + (int) T);
//        System.out.print(D + "Д " + H + "ч " + M + "мин " + S + "с");

        int seconds = 57783003;
        int day = seconds / 3600 / 24;
        int hours = seconds % (3600 *24) / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        System.out.println("new task5 branch");
//        System.out.println("T: " + (int) T);
        System.out.print(day + " day " +  hours + "ч " + minutes + "мин " + seconds + "сек");
    }
}

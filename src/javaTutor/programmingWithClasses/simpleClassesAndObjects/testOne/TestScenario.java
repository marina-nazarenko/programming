package javaTutor.programmingWithClasses.simpleClassesAndObjects.testOne;

import javaTutor.programmingWithClasses.simpleClassesAndObjects.testOne.Test1;

import java.util.Scanner;

public class TestScenario {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Test1 test1 = new Test1();

        System.out.println("Введите А:");
        int a = scanner.nextInt();
        test1.setA(a);

        System.out.println("Введите Б:");
        int b = scanner.nextInt();
        test1.setB(b);

        test1.printInfo();

        int sum = test1.sumAB();
        System.out.println("Сумма А и Б = " + sum);

        int max = test1.maxValue();
        System.out.println("Максимальное значение - " + max);
    }
}

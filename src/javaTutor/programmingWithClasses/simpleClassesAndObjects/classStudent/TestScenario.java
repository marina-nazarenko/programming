package javaTutor.programmingWithClasses.simpleClassesAndObjects.classStudent;

public class TestScenario {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanov K.S.", 611101, new int[]{9, 10, 10, 9, 10});
        student1.printExcellentStudent();

        Student student2 = new Student("Petrov M.l.", 650101, new int[]{9, 2, 4, 9, 10});
        student2.printExcellentStudent();

        Student student3 = new Student("Lotic F.S.", 615051, new int[]{9, 9, 9, 9, 9});
        student3.printExcellentStudent();

        Student student4 = new Student("Sidorov S.T.", 684201, new int[]{8, 7, 10, 9, 10});
        student4.printExcellentStudent();
    }
}
package javaTutor.programmingWithClasses.simpleClassesAndObjects.classStudent;

public class TestScenario {
    public static void main(String[] args) {
        Student[] student = new Student[10];
        student[0] = new Student("Ivanov", 1, new int[]{5, 4, 10, 3, 8});
        student[1] = new Student("Petrov", 2, new int[]{10, 9, 10, 9, 9});
        student[2] = new Student("Motic", 3, new int[]{5, 4, 8, 3, 8});
        student[3] = new Student("Bacol", 4, new int[]{9, 9, 9, 9, 9});
        student[4] = new Student("Koles", 5, new int[]{5, 4, 10, 6, 7});
        student[5] = new Student("Dicar", 6, new int[]{10, 10, 10, 10, 10});
        student[6] = new Student("Pcarav", 7, new int[]{7, 8, 6, 3, 8});
        student[7] = new Student("Nesil", 8, new int[]{8, 8, 8, 8, 8});
        student[8] = new Student("Sefew", 9, new int[]{9, 10, 10, 9, 8});
        student[9] = new Student("Losan", 10, new int[]{10, 9, 10, 9, 9});

        for (int i = 0; i < student.length; i++) {
            student[i].printExcellentStudent();
        }
    }
}
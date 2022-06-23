package javaTutor.programmingWithClasses.simpleClassesAndObjects.classStudent;

public class Student {
    private String name;
    private int groupNumber;
    private int[] academicPerformance = new int[5];

    public Student(String name, int groupNumber, int[] academicPerformance) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public void printExcellentStudent() {
        int cont = 0;
        for (int i : academicPerformance) {
            if (i == 9 || i == 10) {
                cont++;
            }
        }
        if (cont == 5) {
            System.out.println("Отличник " + name + " из группы " + groupNumber);
        }
    }
}

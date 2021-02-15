package DataStructure;

public class Assignment1Q9 extends Student {
    Assignment1Q9(int X, int Y, int Z) {
        super(X, Y, Z);
    }

    public static void main(String[] args) {
        int X,Y,Z;

        Student a = new Student(30,35,25);
        Student b = new Student(52,45,15);
        Student c = new Student(40,12,5);

        Student[] student = {a,b,c};

        System.out.println();

    }


}
class Student {
    private int subjectA;
    private int subjectB;
    private int subjectC;

    Student(int X, int Y, int Z){
        subjectA = X;
        subjectB = Y;
        subjectC = Z;
    }

    public int studentsTotalMarksInAllSubjects(Student[]students){
        int total = 0;
        for (Student student: students){
            total += student.subjectA+student.subjectB+student.subjectC;
        }
        return total;
    }

    public double studentsAverageMarksInAllSubjects(Student[]students){
        int total = 0;
        double average;
        for (Student student: students){
            total += student.subjectA+student.subjectB+student.subjectC;
        }
        average = total/3;
        return average;
    }


    public int [] subjectATotalByStudents(Student[] students){
        int total = 0;
        for (Student s:students){
            total += s.subjectA;
        }
        return new int[]{total};
    }
    public int [] subjectBTotalByStudents(Student[] students){
        int total = 0;
        for (Student s:students){
            total += s.subjectB;
        }
        return new int[]{total};
    }
    public int [] subjectCTotalByStudents(Student[] students){
        int total = 0;
        for (Student s:students){
            total += s.subjectC;
        }
        return new int[]{total};
    }
    public double subjectAAverageByStudents(Student[] students) {
        int total = 0;
        double average;
        for (Student s:students){
            total += s.subjectA;
        }
        average = total/3;
        return average;
    }
    public double subjectBAverageByStudents(Student[] students) {
        int total = 0;
        double average;
        for (Student s:students){
            total += s.subjectB;
        }
        average = total/3;
        return average;
    }
    public double subjectCAverageByStudents(Student[] students) {
        int total = 0;
        double average;
        for (Student s:students){
            total += s.subjectC;
        }
        average = total/3;
        return average;
    }


}

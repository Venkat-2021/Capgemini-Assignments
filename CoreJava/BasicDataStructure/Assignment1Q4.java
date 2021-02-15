package DataStructure;

import java.util.Scanner;

public class Assignment1Q4 {
    public static void main(String[] args) {
        ResultsDeclaration obj = new ResultsDeclaration();

        double subject1Marks;
        double subject2Marks;
        double subject3Marks;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Subject 1 Marks: ");
        subject1Marks = s.nextDouble();
        System.out.println("Enter Subject 2 Marks : ");
        subject2Marks = s.nextDouble();
        System.out.println("Enter Subject 3 Marks: ");
        subject3Marks = s.nextDouble();

        String results = obj.declareResults(subject1Marks,subject2Marks,subject3Marks);
        System.out.println(results);


    }
}
class ResultsDeclaration{
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks){
        if (subject1Marks + subject2Marks + subject3Marks <60 || (subject1Marks >60 || subject2Marks >60 || subject3Marks >60)) return "Failed";
        else if (subject1Marks + subject2Marks > 60 || subject2Marks + subject3Marks >60 || subject3Marks + subject1Marks >60) return "Promoted";
        else if (subject1Marks + subject2Marks + subject3Marks >60) return "Passed";
        else return "Please Enter Marks Again";

    }
}

package LambdaExpressionAssignments;

import java.util.ArrayList;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String>employeeList){
        employeeList.removeIf(employee->employee.length()%2!=0);
        for (String s: employeeList){
            System.out.println(s);
        }
        return employeeList;

    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("SAI");
        list.add("RAVI");
        list.add("NARSIMHA");

        System.out.println("EmployeeList Before Execution "+list);

        Assignment4Q4 obj = new Assignment4Q4();

        System.out.println("\nEmployeeList After Execution");
        obj.removeOddLength(list);

    }
}

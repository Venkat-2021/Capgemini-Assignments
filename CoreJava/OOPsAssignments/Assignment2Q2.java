package OopsAssignment;


import java.util.ArrayList;

public class Assignment2Q2 {
    int salary = 10_000;
    int totalSalary = 0;

    public int getSalary(int salary){
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer>employeeSalaries){
        for (int x:employeeSalaries)
            totalSalary += x;

        return totalSalary;
    }

    public static void main(String[] args) {
        Assignment2Q2 obj = new Assignment2Q2();
        Assignment2Q2 l1 = new Labour();
        int sal = l1.getSalary(obj.salary);
        Assignment2Q2 l2 = new Labour();
        Assignment2Q2 m1 = new Manager();
        Assignment2Q2 m2 = new Manager();

        ArrayList<Integer>employeeSalaries = new ArrayList<>();
        employeeSalaries.add(l1.getSalary(l1.salary));
        employeeSalaries.add(l2.getSalary(l2.salary));
        employeeSalaries.add(m1.getSalary(m1.salary));
        employeeSalaries.add(m2.getSalary(m2.salary));

        System.out.println("Employee Salary : " + sal);
        System.out.println("Employee Salary : " + employeeSalaries);


        System.out.println("Total Employees Salary : "+ obj.totalEmployeesSalary(employeeSalaries));

    }

}
class Manager extends Assignment2Q2{
    @Override
    public int getSalary(int salary){
        int incentive =5_000;
        int managerSalary;
        managerSalary = salary+incentive;
        return managerSalary;
    }

}
class Labour extends Assignment2Q2{
    @Override
    public int getSalary(int salary){
        int overtime =500;
        int labourSalary;
        labourSalary = salary+overtime;
        return labourSalary;
    }
}
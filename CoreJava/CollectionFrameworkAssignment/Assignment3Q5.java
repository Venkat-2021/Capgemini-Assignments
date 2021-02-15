package CollectionFrameworkAssignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment3Q5 {

    public static void main(String[] args) {
        Employee a = new Employee("SAI",101);
        Employee b = new Employee("RAVI",102);
        Map<Employee,String> employeeMap = new HashMap<>();
        employeeMap.put(a,"Manager");
        employeeMap.put(b,"Team Lead");
        for (Employee employee : employeeMap.keySet()){
            System.out.println(employeeMap.get(employee).toString());
        }
        for (Employee employee : employeeMap.keySet()){
            System.out.println(employeeMap.toString());
        }
    }

}
class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
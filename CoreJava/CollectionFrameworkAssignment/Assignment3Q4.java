package CollectionFrameworkAssignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment3Q4 {
    public String getEmployee(HashMap<DataClass,String>dob,String employeeName){
        for (Map.Entry k: dob.entrySet()){
            if (k.getValue() == employeeName){
                System.out.println("Employee Data: " + k.getKey().toString()+":"+k.getValue());
            }
        }

        return employeeName;
    }
    public static void main(String[] args) {
        Assignment3Q4 obj = new Assignment3Q4();

        DataClass a = new DataClass(14,12,1998);
        DataClass b = new DataClass(14,2,2000);
        DataClass c = new DataClass(2,12,2020);
        DataClass d = new DataClass(31,12,2019);

        HashMap<DataClass, String> hashMap = new HashMap<>();
        hashMap.put(a, "SAI" );
        hashMap.put(b, "RAVI" );
        hashMap.put(c, "RAJU" );
        hashMap.put(d, "Praveen" );
        System.out.println("The Employees List: ");

        for (Map.Entry<DataClass, String> dataClassStringEntry : hashMap.entrySet()) {
            System.out.println(((Map.Entry) dataClassStringEntry).getKey() + ":" + ((Map.Entry) dataClassStringEntry).getValue());

        }

    }
}
class DataClass{
    private int date;
    private int month;
    private int year;

    public DataClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
        return "DataClass{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
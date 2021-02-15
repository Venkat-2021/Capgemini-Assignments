package OopsAssignment;

public class Assignment2Q1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck obj1 = SingletonInheritanceCheck.getInstance();
        SingletonInheritanceCheck obj2 = SingletonInheritanceCheck.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);

    }


}

class SingletonInheritanceCheck{
    static SingletonInheritanceCheck obj = new SingletonInheritanceCheck();
    private SingletonInheritanceCheck(){

    }
    public static SingletonInheritanceCheck getInstance(){

        return obj;
    }


}

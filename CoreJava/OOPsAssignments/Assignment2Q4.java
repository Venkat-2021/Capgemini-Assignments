package OopsAssignment;

public class Assignment2Q4 {
    public static void main(String[] args) {

        /**
         *  A obj = new A();
         */
        System.out.println("Abstract class Cannot be Instantiate");

        C obj = new C();
        System.out.println(obj.method());
        System.out.println(obj.method1());
    }
}
abstract class A {
    /**
     * A class can be marked as Abstract without containing any abstract method.
     */
    int num = 1;
}

abstract class B {
    /**
     * A class containing abstract method, must be declare entire class abstract.
     * Abstract class cannot be private
     *
     */
    abstract public int method();

}

class C extends B {
    public int method1(){
        return 1;
    }

    /**
     * When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.
     * Abstract class cannot be final
     */
    @Override
    public int method() {
        return 0;
    }
}


package LambdaExpressionAssignments;

public class Assignment4Q1 {
    public double addition(int num1, int num2){
        MathOperations addition = (a,b)->(a+b);
        return addition.operation(num1,num2);
    }

    public double subtraction(int num1, int num2){
        MathOperations subtraction = (a, b) -> (a-b);
        return subtraction.operation(num1,num2);
    }


    public double multiplication(int num1, int num2){
        MathOperations multiplication = (a, b) -> (a*b);
        return multiplication.operation(num1,num2);
    }

    public double division(int num1, int num2){
        MathOperations division = (a, b) -> (a/b);
        return division.operation(num1,num2);
    }



    public static void main(String[] args) {

        Assignment4Q1 obj = new Assignment4Q1();
        System.out.println(obj.addition(8,2));
        System.out.println(obj.subtraction(8,2));
        System.out.println(obj.multiplication(8,2));
        System.out.println(obj.division(8,2));

    }

}
@FunctionalInterface
interface MathOperations {
    double operation(int a, int b);
}

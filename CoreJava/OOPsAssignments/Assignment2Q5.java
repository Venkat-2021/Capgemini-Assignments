package OopsAssignment;

public class Assignment2Q5 {
    public static void main(String[] args) {
        Shape5 obj = new Rectangle5();
        System.out.println(obj.draw());
        Shape5 obj1 = new Line5();
        System.out.println(obj1.draw());
        Shape5 obj2 = new Cube5();
        System.out.println(obj2.draw());

    }
}
abstract class Shape5{
    abstract public String draw();
}
class Cube5 extends Shape5{
    @Override
    public String draw(){
        return "Drawing Cube5...!";
    }

}
class Line5 extends Shape5{
    @Override
    public String draw(){
        return "Drawing Line5...!";
    }

}
class Rectangle5 extends Shape5{
    @Override
    public String draw(){
        return "Drawing Rectangle5...!";
    }

}

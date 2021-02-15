package OopsAssignment;


public class Assignment2Q6 {
    public static void main(String[] args) {
        Persistence obj = new DatabasePersistence();
        System.out.println(obj.persist());
        Persistence obj1 = new FilePersistence();
        System.out.println(obj1.persist());

    }
}
abstract class Persistence{
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist(){
        return "FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist(){
        return "DatabasePersistence";
    }
}

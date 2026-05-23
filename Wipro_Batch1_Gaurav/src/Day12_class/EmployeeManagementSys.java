package Day12_class;
import java.io.*;

// Q.4 Employee Management System How will you use Serialization in Java to save and retrieve employee objects from files?

class Employee implements Serializable {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EmployeeManagementSys {
    public static void main(String[] args) {

        try {
            Employee e1 = new Employee(1221, "Shivam");

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.txt"));

            oos.writeObject(e1);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.txt"));

            Employee e2 = (Employee) ois.readObject();

            System.out.println(e2.id + " " + e2.name);

            ois.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
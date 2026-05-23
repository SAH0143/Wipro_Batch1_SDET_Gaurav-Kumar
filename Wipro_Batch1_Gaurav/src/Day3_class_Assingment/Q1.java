
// Employee Class : hide salary and allow access only through getter/setter.

package Day3_class_Assingment;

class Employee {

    private int salary = 55000; 

    public int getSalary() {
        return salary;
    }
}

public class Q1 {
	
    public static void main(String[] args) {

        Employee emp = new Employee();
        
        System.out.println("Salary is: " + emp.getSalary());
        
    }
}

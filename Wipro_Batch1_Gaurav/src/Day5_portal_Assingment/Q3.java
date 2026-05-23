package Day5_portal_Assingment;

//3. Write a program where an interface is implemented and exception handling is used inside the method.

interface Result {
    void checkResult(int marks);
}

class Student implements Result {

    public void checkResult(int marks) {

        try {
            if(marks < 0 || marks > 100) {
                throw new Exception("Marks should be between 0 and 100");
            }

            if(marks >= 40) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Q3 {
	public static void main(String[] args) {
		
		  Result r = new Student();

	        r.checkResult(75);   
	        r.checkResult(25);   
	        r.checkResult(150);  // error
	}
}

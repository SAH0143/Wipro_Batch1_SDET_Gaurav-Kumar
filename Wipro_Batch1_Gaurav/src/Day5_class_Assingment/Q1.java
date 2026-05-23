package Day5_class_Assingment;

//1. You are developing a banking application. Each customer has an Account Number that should never change once assigned.

// Question: How will you use the final keyword to ensure the account number cannot be modified after initialization? Write a Java program.

// Idea : 1. Create a class ---> Account 
//		  2. Declare account number as "final"
//		  3. Initialize it in constructor
//		  4. Only allow getter

class Account{
	private final long Acc_No;
	private String name;
	
	Account(int Acc_No, String name){
		this.Acc_No = Acc_No;
		this.name = name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public long getAccountNumber() {
		return Acc_No;
	}
}
public class Q1 {
	public static void main(String[] args) {
		
		Account acc = new Account(585681000, "Gaurav Kumar");
		
		System.out.println("Your Name is :"+acc.getName());
		System.out.println("Your Account Number is :"+acc.getAccountNumber());
	}
}

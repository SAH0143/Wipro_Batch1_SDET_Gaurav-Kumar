package Day5_class_Assingment;

//2. You are building a payment system where the method processPayment() contains secure logic and should not be overridden by any subclass.

// Question: How will you design a class using the final keyword to prevent method overriding? Implement with an example

// Idea : 1. Create parent class ---> Payment
//		  2. Make method ---> final processPayment()
//		  3. Create child class  -->  UpiPayment
//		  4. Final check ---> try overriding (not Allowed)

class PaymentSystem{ //part 1:
	//Part 2: 
	public final void ProccessPayment(double amount) {
		System.out.println("Processing Payment of "+ amount);
	}
}
class UpiPayment extends PaymentSystem{  // Part 3:
	
	public void showUpi() {
		System.out.println("G_Pay, PhonePay, BHIM");
	}
	
// Eg.
	
//	public final void ProccessPayment(double amount) {
//		System.out.println("Upi Payment of "+ amount);
//	}
	
}
public class Q2 {
	public static void main(String[] args) {
		
		UpiPayment  upi1 = new UpiPayment();
		
		upi1.ProccessPayment(56420);
		upi1.showUpi();
	}
}

package Day5_class_Assingment;

// Develop payment system using interface and default method :

// Idea : 1. create an Interface Payment
// 		  2. it will have : one method ---> pay(), and default method ---> common message.
// 		  3. Then create classes : G pay, PhonePay, BHIM.

// PART 1: 

interface Payment{
	void pay(double amount);
	
	//PART 2: default method (common for all)  
	default void message() {
		System.out.println("Payment Successful 😊");
	}
}

// PART 3:

class G_Pay implements Payment{
	
	String upiId;
	
	G_Pay(String upiId){
		this.upiId = upiId;
	}
	
	public void pay(double amount) {
		System.out.println("Paid :"+amount+" using G_Pay " + "upiId :" + upiId);
	}
}

class BHIM implements Payment{
	
	String upiId;
	
	BHIM(String upiId){
		this.upiId = upiId;
	}
	
	public void pay(double amount) {
		System.out.println("Paid :"+amount+" using BHIM " + "upiId :" + upiId);
	}
}
public class PaymentSystemUsingInterface {
	
	public static void main(String[] args) {
		
		Payment p1 = new G_Pay ("krgaurav@okaxix");
		p1.pay(4962);
		p1.message();
		
		Payment p2 = new BHIM ("krgaurav@upi");
		p2.pay(420);
		p2.message();
		
	}

}

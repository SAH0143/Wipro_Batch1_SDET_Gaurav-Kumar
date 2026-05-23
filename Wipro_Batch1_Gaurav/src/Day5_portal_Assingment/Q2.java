package Day5_portal_Assingment;

//2. Create an abstract class Bank with method getInterestRate() and implement it in different bank classes.

// Idea 1. Abstract class ----> method without body
//		2. Child Classes ----> provide implementation

abstract class Bank{
	abstract double getInterestRate();  // Part 1 : abstract method
}

class BOB extends Bank{
	double getInterestRate() {
		return 6.6;
	}
}

class SBI extends Bank{
	double getInterestRate() {
		return 7.1;
	}
}

class ICICI extends Bank{
	double getInterestRate() {
		return 6.8;
	}
}
public class Q2 {
	public static void main(String[] args) {
		Bank b1 = new BOB();
		Bank b2 = new SBI();
		Bank b3 = new ICICI();
		
		System.out.println("BOB rate is :" + b1.getInterestRate());
		System.out.println("SBI rate is :" + b2.getInterestRate());
		System.out.println("ICICI rate is :"+b3.getInterestRate());
		
	}
}

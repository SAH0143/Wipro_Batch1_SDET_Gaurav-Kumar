
// 2. Bank Account : allow only secure deposit /withdrawal

package Day3_class_Assingment;

class Account{
	
	private double  amount = 54321.45;
	
	public void deposit(double amt){
		
		if(amt>0) {
			amount = amount + amt;
			System.out.println("Deposit Successful ");
			System.out.println("Avilable Balance is :"+amount);
		}
		else {
            System.out.println("Invalid deposit amount");
		}
		
	}
	
	public void withdrawal(double amt) {
		
        if (amt > 0 && amt <= amount) {
        	
            amount = amount - amt;
            System.out.println("Withdrwal Successful ");
            System.out.println("Avilable Balance: " + amount);
            
        } 
        
        else {
            System.out.println("Invalid or insufficient Balance");
        }
	}
		
}

public class Q2 {
	
	public static void main(String[] args) {
		
		Account ac = new Account ();
		ac.withdrawal(250.35);
		ac.deposit(527.965);
		
	}

}

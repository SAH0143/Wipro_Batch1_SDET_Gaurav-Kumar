package Day6_class_Assignment;
import java.util.*;

// ATM Card Exception Handling

// Scenario : 1. User inserts card
// 			  2. User enters PIN
//			  3. If PIN is wrong → throw exception
// 			  4. Catch it → show message
//			  5. Finally → log transaction

class ATM{
	private int Pin=3536;
	
	void checkPin(int pin) throws Exception{ // throws (declare)
		
		if(pin != this.Pin) {						// Part 3
			throw new Exception("Invalid PIN");		// throw
		}else {
			System.out.println("PIN Verified");
		}
	}
}

public class ATM_Card_Exception {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ATM atm = new ATM();
		
		System.out.println("Insert Card");   // Part 1
		System.out.println("Enter PIN : ");
		int pin = sc.nextInt();					// Part 2
		
		try {
			atm.checkPin(pin);
			System.out.println("Access Granted");
		}
		
		catch(Exception e ) {
			System.out.println("Error: "+e.getMessage());  // Part 3 (handle error)
		}
		
		finally {
			System.out.println("All is Well");   // Part 4
		}
		sc.close();
	}
}

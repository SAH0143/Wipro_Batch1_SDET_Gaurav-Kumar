package Day2_class_Assingment;
import java.util.*;

// ATM Menu System: Display menu options repeatedly until user chooses to exit.

public class looping_statement_Q5 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean con = true;
		while(con) {
		System.out.println("Check Balance:");
		System.out.println("Withdrawl :");
		System.out.println("Forget pin:");
		
		System.out.println("============");
		
		System.out.println("For Exit press E :");
		
		char ch = sc.next().charAt(0);
		
			if(ch == 'E') {
			
			con = false;
			
			System.out.print("Successfuly Exit");
			
			}
		}
		sc.close();
	}
}

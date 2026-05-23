package Day2_class_Assingment;
import java.util.*;

// Shopping Cart Total Calculator: Keep accepting item prices until user enters 0, then display total

public class looping_statement_Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean ans = true;
		double total = 0;
		
		while(ans) {
			
			System.out.println("Enter item price : ");
			double i_p = sc.nextDouble();
			total = total + i_p;
			
			if(i_p==0) {
				ans = false;
			}
			
		}
		System.out.println("Total price is :"+total);
		sc.close();
		
	}
	
}

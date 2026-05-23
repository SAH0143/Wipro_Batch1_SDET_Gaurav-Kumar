
// 1. Check whether a number is positive or negative 

package Day1_portal_Assingment;
import java.util.*;
public class Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Number is positive");
		}
		
		else if(num<0) {
			System.out.println("Number is negative");
		}
		
		else {
			System.out.println("Number is Zero");
		}
		sc.close();
	}
	
}

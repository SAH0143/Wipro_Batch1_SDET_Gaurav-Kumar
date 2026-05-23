
// 10. Check whether a number is zero, positive, or negative 

package Day1_portal_Assingment;

import java.util.Scanner;

public class Q10 {
	
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

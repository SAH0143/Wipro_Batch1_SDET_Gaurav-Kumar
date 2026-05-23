
// 7. Check eligibility for voting based on age

package Day1_portal_Assingment;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Age: ");
		int Age = sc.nextInt();
		
		if(Age>=18) {
			System.out.println("You are eligible for vote");
		}
		
		else {
			System.out.println("You are not eligible for vote");
		}
		sc.close();
		
	}
	
}

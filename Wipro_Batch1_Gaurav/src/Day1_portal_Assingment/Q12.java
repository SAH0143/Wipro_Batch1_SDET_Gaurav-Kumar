
// 12. Check whether a person is eligible for a loan (age + salary condition) 

package Day1_portal_Assingment;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Age: ");
		int Age = sc.nextInt();
		System.out.println("Enter Your salary: ");
		int Sal = sc.nextInt();
		
		if(Age>=21 && Sal>=50000) {
			System.out.println("You are eligible for loan");
		}
		
		else {
			System.out.println("You are not eligible for loan");
		}
		sc.close();
		
	}
}

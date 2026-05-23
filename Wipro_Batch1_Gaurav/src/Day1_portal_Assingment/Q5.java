
// 5. Check whether a year is a leap year

package Day1_portal_Assingment;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		    System.out.println("Leap Year");
		} else {
		    System.out.println("Not a Leap Year");
		}
		sc.close();
	}
	
}

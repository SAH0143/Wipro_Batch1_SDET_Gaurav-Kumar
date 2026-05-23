
// 13. Check whether a number is divisible by 3 or 7 

package Day1_portal_Assingment;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(num%3==0 && num%7 ==0) {
			System.out.println("yes number is divisible by 3 and 7");
		}
		
		else {
			System.out.println("No number is not divisible by 3 and 7 ");
		}
		sc.close();
	}
}

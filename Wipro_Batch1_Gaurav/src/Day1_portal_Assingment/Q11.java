
// 11. Find the smallest of three numbers 

package Day1_portal_Assingment;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number A: ");
		int num = sc.nextInt();
		System.out.println("Enter Number B: ");
		int num_ = sc.nextInt();
		System.out.println("Enter Number C: ");
		int num__ = sc.nextInt();
		
		if(num<num_ && num<num__) {
			System.out.println("Smallest Number is A : "+num);
		}
		
		else if(num_<num && num_<num__) {
			System.out.println("Smallestt Number is A : "+num_);
		}
		else {
			System.out.println("Smallestt Number is B : "+num__);
		}
		sc.close();
		
	}
		
}

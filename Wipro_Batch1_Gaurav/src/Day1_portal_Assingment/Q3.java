
// 3. Find the largest of two numbers

package Day1_portal_Assingment;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number A: ");
		int num = sc.nextInt();
		System.out.println("Enter Number B: ");
		int num_ = sc.nextInt();
		
		if(num>num_) {
			System.out.println("Largest Number is A : "+num);
		}
		else {
			System.out.println("Largest Number is B : "+num_);
		}
		sc.close();
	}
}

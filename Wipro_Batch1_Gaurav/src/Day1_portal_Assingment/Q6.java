
// 6. Check whether a character is a vowel or consonant

package Day1_portal_Assingment;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Character A-Z or a-z : ");
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
			    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		    System.out.println("Vowel");
		}
		    
		else {
		    	 System.out.println("consonant");
		    }
		sc.close();
	}
}

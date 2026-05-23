package Day2_class_Assingment;
import java.util.*;

//. Even Number Generator: Print all even numbers between 1 and a given number.

public class looping_statement_Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your No. :");
		
		int num = sc.nextInt();
		
		System.out.print("Even No. are in b/w 1 to n are:");
		
		for(int i = 2; i<num;i++) {
			
			if(i%2==0) {
			System.out.print(i+" ");
			}
			
			
		}
		
		sc.close();
		
	}
	
}

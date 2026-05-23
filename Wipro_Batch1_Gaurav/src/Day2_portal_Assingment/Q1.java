// 1. Write a program to check whether a number is even or odd using switch-case.
package Day2_portal_Assingment;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) {

            case 0:
                System.out.println("Even Number");
                break;

            case 1:
                System.out.println("Odd Number");
                break;

            default:
                System.out.println("Invalid Input");
        }

        sc.close();
		
	}
	
}

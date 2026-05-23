package Day2_class_Assingment;

import java.util.*;

//Password Retry System: Allow a user to retry password entry up to a fixed number of attempts

public class looping_statement_Q4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Password :");
		
		int tryy = 3;
		int passs=2451;
		
		while (tryy<=3) {
			int pass = sc.nextInt();
			if(pass==passs) {
				System.out.println("Log in Successful");
				break;
			}
			else {
				System.out.println("Wrong Password, Try again 😊");
			}
			
			tryy--;
		}
		
		sc.close();
		
	}

}

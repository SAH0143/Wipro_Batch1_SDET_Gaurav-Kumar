// 14. Simple calculator using switch case 
package Day1_portal_Assingment;
import java.util.Scanner;
public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number A: ");
		int num = sc.nextInt();
		System.out.println("Enter +, -, *, %, / : ");
		char ch = sc.next().charAt(0);
		System.out.println("Enter Number B: ");
		int num2= sc.nextInt();
		
		switch(ch){
		
			case '+': System.out.println(num+num2);
					break;
			case '-': System.out.println(num-num2);
				break;
				
			case '*': System.out.println(num*num2);
				break;
				
			case '%': System.out.println(num%num2);
				break;
				
			case '/': System.out.println(num/num2);
				break;
				
			default : System.out.println("Wrong Operator");
			
		}
		
		sc.close();
	}
}
